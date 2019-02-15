package com.java.impatient.ch04.sec02;

import java.util.Objects;
/**
 * 
 * @ClassName DiscountedItem
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-07 16:53
 * @Version 1.0
 */
public class DiscountedItem extends Item {
    private double discount;

    /**
     * 
     * @param description
     * @param price
     * @param discount
     */
    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    /**
     * 重新equals方法
     * @param otherObject
     * @return
     */
    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) {
            return false;
        }
        DiscountedItem other = (DiscountedItem) otherObject;
        return discount == other.discount;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}