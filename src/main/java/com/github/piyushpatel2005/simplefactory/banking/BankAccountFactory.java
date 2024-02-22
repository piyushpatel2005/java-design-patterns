package com.github.piyushpatel2005.simplefactory.banking;

import com.github.piyushpatel2005.simplefactory.banking.domain.CurrentAccount;
import com.github.piyushpatel2005.simplefactory.banking.domain.SavingsAccount;
import com.github.piyushpatel2005.simplefactory.banking.domain.AccountType;
import com.github.piyushpatel2005.simplefactory.banking.domain.BankAccount;

/**
 * Simple Factory Pattern
 */
public class BankAccountFactory {
    public static BankAccount createAccount(AccountType type) {
        if (type.equals(AccountType.SAVINGS)) {
            return new SavingsAccount();
        } else if (type.equals(AccountType.CURRENT)) {
            return new CurrentAccount();
        }
        return null;
    }
}
