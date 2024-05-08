package com.github.piyushpatel2005.template.orders.model;

public class PhoneOrder extends OrderTemplate {
    @Override
    public void processPayment() {
        System.out.println("Process payment with cash on delivery or card on delivery");
    }

    @Override
    public void provideConfirmation() {
        System.out.println("Send order details to customer using SMS or Email.");
    }

    @Override
    public void deliver() {
        System.out.println("Deliver items to customer address.");
    }

    @Override
    public void checkout() {
        System.out.println("Confirm order with customer over the phone and check out items.");
    }
}
