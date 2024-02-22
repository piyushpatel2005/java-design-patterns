package com.github.piyushpatel2005.abstractfactory.banking.model.checking;

import com.github.piyushpatel2005.abstractfactory.banking.model.BankAccount;

public abstract class CheckingAccount extends BankAccount {
    private final double INTEREST_RATE = 0.05;
    private final int FREE_TRANSACTIONS = 5;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double getInterestRate() {
        return INTEREST_RATE * balance;
    }
}
