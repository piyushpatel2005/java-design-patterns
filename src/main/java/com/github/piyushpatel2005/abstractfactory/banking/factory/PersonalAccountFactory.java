package com.github.piyushpatel2005.abstractfactory.banking.factory;

import com.github.piyushpatel2005.abstractfactory.banking.model.checking.CheckingAccount;
import com.github.piyushpatel2005.abstractfactory.banking.model.checking.PersonalCheckingAccount;
import com.github.piyushpatel2005.abstractfactory.banking.model.savings.PersonalSavingsAccount;
import com.github.piyushpatel2005.abstractfactory.banking.model.savings.SavingsAccount;

public class PersonalAccountFactory extends AbstractAccountFactory {
    @Override
    public CheckingAccount createCheckingAccount() {
        return new PersonalCheckingAccount("Personal Account", 100.0);
    }

    @Override
    public SavingsAccount createSavingsAccount() {
        return new PersonalSavingsAccount("Personal Account", 100.0);
    }
}
