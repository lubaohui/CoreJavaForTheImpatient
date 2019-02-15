package com.java.impatient.ch03.sec09;

import java.util.Random;
/**
 *
 * @ClassName AnonymousClassDemo
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-06 20:40
 * @Version 1.0
 */
public class AnonymousClassDemo {
    private static Random generator = new Random();

    public static IntSequence randomInts(int low, int high) {
        return new IntSequence() {
            @Override
            public int next() { return low + generator.nextInt(high - low + 1); }
            @Override
            public boolean hasNext() { return true; }
        };
    }

    public static void main(String[] args) {
        IntSequence dieTosses = randomInts(1, 6);
        int cnt = 10;
        for (int i = 0; i < cnt; i++) {
            System.out.println(dieTosses.next());
        }
    }
}
