package com.github.piyushpatel2005.factorymethod.banking.domain;

public class CurrentAccount implements BankAccount {
    private static final double INTEREST_RATE = 0.05;

    @Override
    public String getAccountType() {
        return "Current";
    }

    @Override
    public void deposit() {
        System.out.printf("Depositing funds into Current account");
    }
}
