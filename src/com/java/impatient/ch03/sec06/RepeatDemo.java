package com.java.impatient.ch03.sec06;

import java.util.function.IntConsumer;

/**
 * 使用Lambda表达式，延迟执行
 * @author
 * @date
 */
public class RepeatDemo {

    /**
     * 函数体，重复多次执行函数接口
     * @param n 重复次数
     * @param action 函数接口体
     */
    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }

    /**
     * 函数体，重复多次执行函数接口
     * @param n 重复次数
     * @param action 函数接口体
     */
    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }

    /**
     * 重复多次传递信息
     * @param text 信息体
     * @param count 次数
     */
    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
           for (int i = 0; i < count; i++) {
              System.out.println(text);
           }
        };
        new Thread(r).start();                  
     }
    
    public static void main(String[] args) {
        //重复10次，执行函数方法
        repeat(10, () -> System.out.println("Hello, World!"));

        System.out.println("\n");

        repeat(10, i -> System.out.println("Countdown: " + (9 - i)));

        System.out.println("\n");

        repeatMessage("Hello", 10);
    }
}
