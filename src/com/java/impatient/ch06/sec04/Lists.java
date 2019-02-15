package com.java.impatient.ch06.sec04;

import java.util.List;

/**
 * 
 * @ClassName Lists
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:20
 * @Version 1.0
 */
public class Lists {
    public static boolean hasNulls(List<?> elements) {
        for (Object e : elements) {
            if (e == null) {
                return true;
            }
        }
        return false;
    }

    public static void swap(List<?> elements, int i, int j) {
        swapHelper(elements, i, j);
    }
    
    private static <T> void swapHelper(List<T> elements, int i, int j) {
        T temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }
}