package com.java.impatient.ch06.sec04;

/**
 * 
 * @ClassName Employee
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:19
 * @Version 1.0
 */
public class Employee {
    private String name;
    private double salary;
        
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;    
    }
    
    public final String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
