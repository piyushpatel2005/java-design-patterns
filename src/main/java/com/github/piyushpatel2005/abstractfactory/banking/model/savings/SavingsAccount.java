package com.github.piyushpatel2005.abstractfactory.banking.model.savings;

import com.github.piyushpatel2005.abstractfactory.banking.model.BankAccount;

public abstract class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}
