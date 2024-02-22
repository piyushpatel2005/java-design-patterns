package com.github.piyushpatel2005.factorymethod.banking.factory;

import com.github.piyushpatel2005.factorymethod.banking.domain.BankAccount;
import com.github.piyushpatel2005.factorymethod.banking.domain.CurrentAccount;

public class CurrentAccountFactory extends BankAccountFactory {
    public BankAccount createAccount() {
        return new CurrentAccount();
    }
}
