package com.github.piyushpatel2005.simplefactory.banking.domain;

public class CurrentAccount implements BankAccount {
    @Override
    public String getAccountType() {
        return "Current";
    }
}
