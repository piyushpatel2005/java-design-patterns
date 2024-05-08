package com.github.piyushpatel2005.template.orders.model;

public class InStoreOrder extends OrderTemplate {
    @Override
    public void processPayment() {
        System.out.println("Process payment with cash, debit, credit or gift card");
    }

    @Override
    public void provideConfirmation() {
        System.out.println("Print receipt for the order.");
    }

    @Override
    public void deliver() {
        System.out.println("Bag items at the counter");
    }
}
