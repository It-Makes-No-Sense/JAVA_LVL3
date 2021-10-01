package HomeWork1;

import java.util.ArrayList;

public class Array {
    public static void replace2Elements(Object[] arr, int i1, int i2) {         //#2
        Object temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static <T> ArrayList<T> arrToList(T[] arr) {         //#2
        ArrayList<T> result = new ArrayList<T>(arr.length);
        for (int i = 0, arrLength = arr.length; i < arrLength; i++) {
            T t = arr[i];
            result.add(t);
        }
        return result;
    }
}
