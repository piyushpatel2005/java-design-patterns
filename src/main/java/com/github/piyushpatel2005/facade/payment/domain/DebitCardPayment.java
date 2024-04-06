package com.github.piyushpatel2005.facade.payment.domain;

public class DebitCardPayment implements PaymentService {
    @Override
    public boolean pay(double amount, String accountNumber) {
        System.out.println("Paying $" + amount + " using debit card " + accountNumber);
        return true;
    }
}
