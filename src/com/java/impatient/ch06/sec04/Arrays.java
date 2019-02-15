package com.java.impatient.ch06.sec04;

import java.util.function.Predicate;

/**
 * 
 * @ClassName Arrays
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:18
 * @Version 1.0
 */
public class Arrays {
    public static <T> void printAll(T[] elements, Predicate<? super T> filter) {
        for (T e : elements) {
            if (filter.test(e)){
                System.out.println(e.toString());
            }
        }

    }
}
