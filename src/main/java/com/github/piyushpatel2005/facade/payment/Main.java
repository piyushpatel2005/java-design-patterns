package com.github.piyushpatel2005.facade.payment;

public class Main {


    public static void main(String[] args) {
        PaymentServiceFacade paymentServiceFacade = new PaymentServiceFacade();
        paymentServiceFacade.makePayment(100, "1234567890", "credit");
        paymentServiceFacade.makePayment(100, "1234567890", "debit");
        paymentServiceFacade.makePayment(100, "1234567890", "gift");
    }
}
