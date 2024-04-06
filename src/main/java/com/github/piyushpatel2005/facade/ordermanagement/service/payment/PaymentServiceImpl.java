package com.github.piyushpatel2005.facade.ordermanagement.service.payment;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public boolean processPayment(double amount, String creditCardDetails) {
        System.out.println("Payment processed for amount " + amount + " using credit card " + creditCardDetails);
        return true;
    }
}
