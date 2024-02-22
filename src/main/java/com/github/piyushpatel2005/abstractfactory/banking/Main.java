package com.github.piyushpatel2005.abstractfactory.banking;

import com.github.piyushpatel2005.abstractfactory.banking.factory.AbstractAccountFactory;
import com.github.piyushpatel2005.abstractfactory.banking.model.FactoryType;
import com.github.piyushpatel2005.abstractfactory.banking.model.checking.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        AbstractAccountFactory accountFactory = AbstractAccountFactory.getFactory(FactoryType.PERSONAL);
        CheckingAccount checkingAccount = accountFactory.createCheckingAccount();
        System.out.println(checkingAccount.getClass().getName());

        accountFactory = AbstractAccountFactory.getFactory(FactoryType.BUSINESS);
        checkingAccount = accountFactory.createCheckingAccount();
        System.out.println(checkingAccount.getClass().getName());
    }
}
