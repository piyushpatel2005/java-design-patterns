package com.github.piyushpatel2005.strategy;

import com.github.piyushpatel2005.strategy.discounts.FixedDiscountStrategy;
import com.github.piyushpatel2005.strategy.discounts.PercentageDiscountStrategy;
import com.github.piyushpatel2005.strategy.model.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(100);
        System.out.println("Total price with zero discount: " + order.getTotal());

        order.setDiscountStrategy(new FixedDiscountStrategy(10));
        System.out.println("Total price after 10$ discount: " + order.getTotal());

        order.setDiscountStrategy(new PercentageDiscountStrategy(24));
        System.out.println("Total price after 24% discount: " + order.getTotal());
    }
}
