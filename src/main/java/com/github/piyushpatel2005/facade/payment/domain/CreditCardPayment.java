package com.github.piyushpatel2005.facade.payment.domain;

public class CreditCardPayment implements PaymentService {
    @Override
    public boolean pay(double amount, String accountNumber) {
        System.out.println("Paying $" + amount + " using credit card " + accountNumber);
        return true;
    }
}
