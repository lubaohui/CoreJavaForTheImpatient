package com.java.impatient.ch10.sec02;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 
 * @ClassName VisibilityDemo
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-13 16:07
 * @Version 1.0
 */
public class VisibilityDemo {
    private static boolean done = false; // add volatile
    
    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 1; i <= 1000; i++) {
                System.out.println("Hello " + i);
            }

            done = true;
        };
        Runnable goodbye = () -> {
            int i = 1;
            while (!done) {
                i++;
            }
            System.out.println("Goodbye " + i);
        };
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);        
        executor.execute(goodbye);        
    }
}