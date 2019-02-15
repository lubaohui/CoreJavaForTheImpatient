package com.java.impatient.ch04.sec01;

/**
 * 继承一个类
 * @ClassName Manager
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-07 16:41
 * @Version 1.0
 */
public class Manager extends Employee {
    private double bonus;
    
    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() { // Overrides superclass method
        return super.getSalary() + bonus;
    }
} 