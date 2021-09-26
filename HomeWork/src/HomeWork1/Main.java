package HomeWork1;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleFruitBox = new Box<>(new Apple(), new Apple(), new Apple());

        Box<Orange> oranges = new Box<>(new Orange(), new Orange());

        System.out.println(appleFruitBox.compare(oranges));

        Box<Orange> orangeFruitBox = new Box<>(new Orange());

        System.out.println(oranges.getWeight());
        oranges.transferAll(orangeFruitBox);
        System.out.println(orangeFruitBox.getWeight());
        System.out.println(oranges.getWeight());
    }
}
