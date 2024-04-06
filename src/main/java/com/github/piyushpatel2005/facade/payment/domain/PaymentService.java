package com.github.piyushpatel2005.facade.payment.domain;

public interface PaymentService {
    boolean pay(double amount, String accountNumber);
}
