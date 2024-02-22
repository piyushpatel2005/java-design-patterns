package com.github.piyushpatel2005.factorymethod.banking;

import com.github.piyushpatel2005.factorymethod.banking.domain.AccountType;
import com.github.piyushpatel2005.factorymethod.banking.domain.BankAccount;
import com.github.piyushpatel2005.factorymethod.banking.factory.BankAccountFactory;
import com.github.piyushpatel2005.factorymethod.banking.factory.CurrentAccountFactory;
import com.github.piyushpatel2005.factorymethod.banking.factory.SavingsAccountFactory;

public class Main {
    public static void main(String[] args) {
        BankAccountFactory savingsFactory = new SavingsAccountFactory();
        BankAccount savingsAccount = savingsFactory.createAccount();
        System.out.println(savingsAccount.getAccountType());
        savingsAccount.deposit();

        BankAccountFactory currentFactory = new CurrentAccountFactory();
        BankAccount currentAccount = currentFactory.createAccount();
        System.out.println(currentAccount.getAccountType());
        currentAccount.deposit();
    }
}
