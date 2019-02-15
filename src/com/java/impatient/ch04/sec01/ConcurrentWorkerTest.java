package com.java.impatient.ch04.sec01;

/**
 * 
 * @ClassName ConcurrentWorkerTest
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-07 16:45
 * @Version 1.0
 */
public class ConcurrentWorkerTest {
    public static void main(String[] args) {
        ConcurrentWorker worker = new ConcurrentWorker();
        worker.work();
        System.out.println("Done");
    }
}
