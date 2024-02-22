package com.github.piyushpatel2005.abstractfactory.banking.factory;

import com.github.piyushpatel2005.abstractfactory.banking.model.FactoryType;
import com.github.piyushpatel2005.abstractfactory.banking.model.checking.CheckingAccount;
import com.github.piyushpatel2005.abstractfactory.banking.model.savings.SavingsAccount;


public abstract class AbstractAccountFactory {
    public static AbstractAccountFactory getFactory(FactoryType factory) {
        switch (factory) {
            case PERSONAL:
                return new PersonalAccountFactory();
            case BUSINESS:
                return new BusinessAccountFactory();
            default:
                throw new IllegalArgumentException("Account type not supported");
        }
    }

    public abstract CheckingAccount createCheckingAccount();
    public abstract SavingsAccount createSavingsAccount();
}
