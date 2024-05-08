package com.github.piyushpatel2005.strategy.model;

import com.github.piyushpatel2005.strategy.discounts.DiscountStrategy;
import com.github.piyushpatel2005.strategy.discounts.ZeroDiscountStrategy;

public class Order {
    private double price;
    private DiscountStrategy discountStrategy;

    public Order(double price, DiscountStrategy discountStrategy) {
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public Order(double price) {
        this(price, new ZeroDiscountStrategy());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getTotal() {
        return price - discountStrategy.getDiscount(price);
    }
}
