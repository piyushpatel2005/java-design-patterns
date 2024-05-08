package com.github.piyushpatel2005.template.orders.model;

public abstract class OrderTemplate {
    public final void processOrder() {
        checkout();
        processPayment();
        provideConfirmation();
        deliver();
    }

    public void checkout() {
        System.out.println("Checking out items in the cart");
    }

    public abstract void processPayment();

    public abstract void provideConfirmation();

    public abstract void deliver();
}
