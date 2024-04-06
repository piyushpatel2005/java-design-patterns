package com.github.piyushpatel2005.facade.payment.domain;

public class GiftCardPayment implements PaymentService {
    @Override
    public boolean pay(double amount, String accountNumber) {
        System.out.println("Paying $" + amount + " using gift card " + accountNumber);
        return true;
    }
}
