package com.github.piyushpatel2005.facade.ordermanagement.service.payment;

public interface PaymentService {
    boolean processPayment(double amount, String creditCardDetails);
}
