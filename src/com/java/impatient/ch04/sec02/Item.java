package com.java.impatient.ch04.sec02;

import java.util.Objects;

/**
 * 
 * @ClassName Item
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-07 16:54
 * @Version 1.0
 */
public class Item {
    private String description;
    private double price;
        
    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    /**
     * 
     * @param otherObject
     * @return
     */
    @Override
    public boolean equals(Object otherObject) {
        // A quick test to see if the objects are identical
        if (this == otherObject) {
            return true;
        }
        // Must return false if the explicit parameter is null
        if (otherObject == null) {
            return false;
        }
        // Check that otherObject is a Item
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        // Test whether the instance variables have identical values
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description)
            && price == other.price;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }
}