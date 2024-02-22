package com.github.piyushpatel2005.simplefactory.banking.domain;

public class SavingsAccount implements BankAccount {
    @Override
    public String getAccountType() {
        return "Savings";
    }
}
