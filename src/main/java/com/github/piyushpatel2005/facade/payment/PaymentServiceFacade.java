package com.github.piyushpatel2005.facade.payment;

import com.github.piyushpatel2005.facade.payment.domain.CreditCardPayment;
import com.github.piyushpatel2005.facade.payment.domain.DebitCardPayment;
import com.github.piyushpatel2005.facade.payment.domain.GiftCardPayment;

public class PaymentServiceFacade {
    private CreditCardPayment creditCardPayment;
    private DebitCardPayment debitCardPayment;
    private GiftCardPayment giftCardPayment;

    public PaymentServiceFacade() {
        creditCardPayment = new CreditCardPayment();
        debitCardPayment = new DebitCardPayment();
        giftCardPayment = new GiftCardPayment();
    }

   public boolean makePayment(double amount, String accountNumber, String paymentType) {
        if (paymentType.equals("credit")) {
            return creditCardPayment.pay(amount, accountNumber);
        } else if (paymentType.equals("debit")) {
            return debitCardPayment.pay(amount, accountNumber);
        } else if (paymentType.equals("gift")) {
            return giftCardPayment.pay(amount, accountNumber);
        } else {
            return false;
        }
    }
}
