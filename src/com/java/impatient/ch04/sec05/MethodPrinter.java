package com.java.impatient.ch04.sec05;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @ClassName MethodPrinter
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-11 15:56
 * @Version 1.0
 */
public class MethodPrinter {

    public static void main(String[] args) throws ReflectiveOperationException {
        System.out.print("Class name: ");
        Scanner in = new Scanner(System.in);
        String className = in.nextLine();

        Class<?> cl = Class.forName(className);

        while (cl != null) {
            for (Method m : cl.getDeclaredMethods()) {
                //输出方法的信息
                System.out.println(
                    Modifier.toString(m.getModifiers()) + " " +
                    m.getReturnType().getCanonicalName() + " " +
                    m.getName() +
                    Arrays.toString(m.getParameters()));                    
            }
            cl = cl.getSuperclass();
        }

    }
}
