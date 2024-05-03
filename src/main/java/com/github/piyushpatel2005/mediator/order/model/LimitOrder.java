package com.github.piyushpatel2005.mediator.order.model;

public class LimitOrder implements Order {
    private final OrderType orderType;
    private double limitPrice;

    public LimitOrder(OrderType orderType, double limitPrice) {
        this.orderType = orderType;
        this.limitPrice = limitPrice;
    }

    @Override
    public void submit() {
        System.out.println("Limit order submitted");
    }

    @Override
    public void cancel() {
        System.out.println("Limit order cancelled");
    }
}
