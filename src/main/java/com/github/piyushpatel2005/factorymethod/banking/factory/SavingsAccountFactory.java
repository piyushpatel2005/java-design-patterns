package com.github.piyushpatel2005.factorymethod.banking.factory;

import com.github.piyushpatel2005.factorymethod.banking.domain.BankAccount;
import com.github.piyushpatel2005.factorymethod.banking.domain.SavingsAccount;

public class SavingsAccountFactory extends BankAccountFactory {
    public BankAccount createAccount() {
        return new SavingsAccount();
    }
}
