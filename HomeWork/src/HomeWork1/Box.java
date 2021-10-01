package HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(T fruit) {
        this.fruits.add(fruit);
    }

    public double getWeight() {
        double weight = 0.0;
        for (int i = 0, fruitsSize = fruits.size(); i < fruitsSize; i++) {
            T fruit = fruits.get(i);
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.0001;
    }

    public void transferAll(Box<? super T> another) {
        if (this == another) return;
        another.fruits.addAll(fruits);
        fruits.clear();
    }

    public List<T> getFruits() {
        return fruits;
    }
}
