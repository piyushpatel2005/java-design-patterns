package com.github.piyushpatel2005.abstractfactory.banking.factory;

import com.github.piyushpatel2005.abstractfactory.banking.model.checking.BusinessCheckingAccount;
import com.github.piyushpatel2005.abstractfactory.banking.model.checking.CheckingAccount;
import com.github.piyushpatel2005.abstractfactory.banking.model.savings.BusinessSavingsAccount;
import com.github.piyushpatel2005.abstractfactory.banking.model.savings.SavingsAccount;

public class BusinessAccountFactory extends AbstractAccountFactory {
    @Override
    public CheckingAccount createCheckingAccount() {
        return new BusinessCheckingAccount("Business Account", 10000.0);
    }

    @Override
    public SavingsAccount createSavingsAccount() {
        return new BusinessSavingsAccount("Business Account", 100000.0);
    }
}
