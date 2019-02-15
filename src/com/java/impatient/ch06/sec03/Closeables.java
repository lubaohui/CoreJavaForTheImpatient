package com.java.impatient.ch06.sec03;

import java.util.ArrayList;

/**
 * 
 * @ClassName Closeables
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:14
 * @Version 1.0
 */
public class Closeables {
    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
        for (T elem : elems) {
            elem.close();
        }
    }
}