package it.euris.academy2023.dynamicgenerics;

import java.util.Arrays;
import java.util.Comparator;

public class DynamicArrayV2 {

    // CAMPI
    private int currentSize;
    private Object[] arrayData;
    private int count;
    public static final int GROW_RATE = 2;


    public DynamicArrayV2(int initialCapacity) {
        this.currentSize = initialCapacity;
        this.arrayData = new Object[this.currentSize];
        this.count = 0;
    }

    public void add(Object item) {
        if (count >= currentSize) {
            expand();
        }
        this.arrayData[count] = item;
        count = count + 1;
    }

    private void expand() {
        System.out.println("Increasing size from " + currentSize + " to " + (currentSize + GROW_RATE));
        currentSize = currentSize + GROW_RATE;
        Object[] temp = new Object[currentSize];
        for (int i = 0; i < this.arrayData.length; i++) {
            temp[i] = this.arrayData[i];
        }
        this.arrayData = temp;
    }

    public Object get(int index) {
        if (index >= count) {
            throw new RuntimeException("Dynamic array index out of bound");
        }
        return this.arrayData[index];
    }

    public String toString() {
        String values = "LISTA\n-------------";
        for (int i = 0; i < count; i++) {
            values = values + "\nPOS -> " + i + " | VALUE -> " + arrayData[i].toString();
        }

        return values;
    }


    public int size() {
        return this.count;
    }

    public boolean contains(Object o) {
        for (Object obj : arrayData) {
            if (obj.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void sort(Comparator comparator) {
        Arrays.sort(arrayData, 0, count, comparator);
    }
}
