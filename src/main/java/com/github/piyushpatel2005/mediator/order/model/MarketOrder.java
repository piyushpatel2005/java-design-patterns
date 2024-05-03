package com.github.piyushpatel2005.mediator.order.model;

public class MarketOrder implements Order {
    private final OrderType orderType;

    public MarketOrder(OrderType orderType) {
        this.orderType = orderType;
    }

    @Override
    public void submit() {
        System.out.println("Market order submitted");
    }

    @Override
    public void cancel() {
        System.out.println("Market order cancelled");
    }
}
