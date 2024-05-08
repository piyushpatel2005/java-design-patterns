package com.github.piyushpatel2005.template.orders.model;

public class OnlineOrder extends OrderTemplate {
    @Override
    public void processPayment() {
        System.out.println("Provide credit card information and process payment");
    }

    @Override
    public void provideConfirmation() {
        System.out.println("Email receipt for the order.");
    }

    @Override
    public void deliver() {
        System.out.println("Notify the shipping department to pack the item for delivery.");
    }
}
