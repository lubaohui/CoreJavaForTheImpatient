package com.java.impatient.ch04.sec03;

import java.util.Scanner;

/**
 * 
 * @ClassName Calculator
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-07 17:08
 * @Version 1.0
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First operand: ");
        int a = in.nextInt();
        System.out.print("Operator: ");
        String opSymbol = in.next();
        System.out.print("Second operand: ");
        int b = in.nextInt();
        for (Operation op : Operation.values()) {
            if (op.getSymbol().equals(opSymbol)) {
                int result = op.eval(a, b);
                System.out.println(result);
            } 
        }
    }
}
