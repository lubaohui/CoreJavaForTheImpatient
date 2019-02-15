package com.java.impatient.ch04.sec01;

/**
 * 
 * @ClassName ConcurrentWorker
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-07 16:45
 * @Version 1.0
 */
public class ConcurrentWorker extends Worker {
    public void work() { 
        Thread t = new Thread(super::work);
        t.start();
    }
}