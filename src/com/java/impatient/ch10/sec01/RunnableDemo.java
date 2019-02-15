package com.java.impatient.ch10.sec01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 
 * @ClassName RunnableDemo
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-13 15:20
 * @Version 1.0
 */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 1; i <= 1000; i++) {
                System.out.println("Hello " + i);
            }
        };
        Runnable goodbyes = () -> {
            for (int i = 1; i <= 1000; i++) {
                System.out.println("Goodbye " + i);
            }

        };
        
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);        
        executor.execute(goodbyes);        
    }
}