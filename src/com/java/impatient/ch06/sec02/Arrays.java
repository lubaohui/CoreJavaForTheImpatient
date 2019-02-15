package com.java.impatient.ch06.sec02;

/**
 * 
 * @ClassName Arrays
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:09
 * @Version 1.0
 */
public class Arrays {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }
}