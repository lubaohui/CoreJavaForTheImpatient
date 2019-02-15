package com.java.impatient.ch06.sec04;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 
 * @ClassName Employees
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:20
 * @Version 1.0
 */
public class Employees {

    public static void printNames(ArrayList<? extends Employee> staff) {
        for (int i = 0; i < staff.size(); i++) {
            Employee e = staff.get(i);
            System.out.println(e.getName());
        }
    }
    
    public static void printAll(Employee[] staff, Predicate<? super Employee> filter) {
        for (Employee e : staff) {
            if (filter.test(e)) {
                System.out.println(e.getName());
            }
        }
    }
}
