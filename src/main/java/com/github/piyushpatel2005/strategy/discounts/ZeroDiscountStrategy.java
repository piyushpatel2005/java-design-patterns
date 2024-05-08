package com.github.piyushpatel2005.strategy.discounts;

public class ZeroDiscountStrategy implements DiscountStrategy {
    @Override
    public double getDiscount(double price) {
        return 0;
    }
}
