package com.java.impatient.ch04.sec02;

/**
 * 
 * @ClassName Manager
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-07 17:08
 * @Version 1.0
 */
public class Manager extends Employee {
    private double bonus;
    
    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }

    /**
     * 
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() { // Overrides superclass method
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }

    @Override
    public Manager clone() throws CloneNotSupportedException {
        return (Manager) super.clone();
    }
} 