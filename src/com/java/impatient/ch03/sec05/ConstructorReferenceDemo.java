package com.java.impatient.ch03.sec05;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 构造方法引用
 */
public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Peter");
        names.add("Paul");
        names.add("Mary");

        Employee[] employees = names.stream().map(Employee::new).toArray(Employee[]::new);

        for (Employee e : employees) {
            System.out.println(e.getName());
        }

        System.out.println("\n");

        Arrays.stream(employees).forEach(emp -> System.out.println(emp.getName()));




    }
}
