package com.github.piyushpatel2005.factorymethod.banking.factory;

import com.github.piyushpatel2005.factorymethod.banking.domain.AccountType;
import com.github.piyushpatel2005.factorymethod.banking.domain.BankAccount;
import com.github.piyushpatel2005.factorymethod.banking.domain.CurrentAccount;
import com.github.piyushpatel2005.factorymethod.banking.domain.SavingsAccount;

/**
 * Simple Factory Pattern
 */
public abstract class BankAccountFactory {
    public abstract BankAccount createAccount();
}
