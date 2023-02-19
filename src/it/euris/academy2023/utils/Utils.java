package it.euris.academy2023.utils;

public class Utils {

    private Utils() {}

    public static void swap(Object[] arrayData, int first, int second) {
        Object temp = arrayData[first];
        arrayData[first] = arrayData[second];
        arrayData[second] = temp;
    }
}
