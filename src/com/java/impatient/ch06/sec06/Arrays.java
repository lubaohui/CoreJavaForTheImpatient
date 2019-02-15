package com.java.impatient.ch06.sec06;

import java.util.ArrayList;
import java.util.function.IntFunction;

/**
 *
 * @ClassName Arrays
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:52
 * @Version 1.0
 */
public class Arrays {
    public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
        T[] result = constr.apply(n); 
        for (int i = 0; i < n; i++) {
            result[i] = obj;
        }
        return result;
    }
    
    public static int[] repeat(int n, int obj, IntFunction<int[]> constr) {
        int[] result = constr.apply(n); 
        for (int i = 0; i < n; i++) {
            result[i] = obj;
        }
        return result;
    }
    
    public static <T> T[] repeat(int n, T obj, T[] array) {
        T[] result;
        if (array.length >= n){
            result = array;
        } else {
            @SuppressWarnings("unchecked") T[] newArray
               = (T[]) java.lang.reflect.Array.newInstance(
                   array.getClass().getComponentType(),  n);
            result = newArray;
        }   
        for (int i = 0; i < n; i++) {
            result[i] = obj;
        }
        return result;
    }    
    
    @SafeVarargs
    public static <T> ArrayList<T> asList(T... elements) {
        ArrayList<T> result = new ArrayList<>();
        for (T e : elements) {
            result.add(e);
        }
        return result;
    }
}
