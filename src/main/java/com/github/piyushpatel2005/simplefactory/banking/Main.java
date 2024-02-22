package com.github.piyushpatel2005.simplefactory.banking;

import com.github.piyushpatel2005.simplefactory.banking.domain.AccountType;
import com.github.piyushpatel2005.simplefactory.banking.domain.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = BankAccountFactory.createAccount(AccountType.SAVINGS);
        BankAccount currentAccount = BankAccountFactory.createAccount(AccountType.CURRENT);

        System.out.println(savingsAccount.getAccountType());
        System.out.println(currentAccount.getAccountType());
    }
}
