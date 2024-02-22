package com.github.piyushpatel2005.factorymethod.banking.domain;

public class SavingsAccount implements BankAccount {
    @Override
    public String getAccountType() {
        return "Savings";
    }

    public void deposit() {
        System.out.println("Depositing funds in Savings account");
    }
}
