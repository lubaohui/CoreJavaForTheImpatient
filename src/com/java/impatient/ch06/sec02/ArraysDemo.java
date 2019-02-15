package com.java.impatient.ch06.sec02;

/**
 * 
 * @ClassName ArraysDemo
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:09
 * @Version 1.0
 */
public class ArraysDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.swap(friends, 0, 1);

        System.out.println(java.util.Arrays.toString(friends));

        
        //参数类型与泛型不一致
        //Double[] result = Arrays.swap(0, 1, 1.5, 2, 3);
    }
}
