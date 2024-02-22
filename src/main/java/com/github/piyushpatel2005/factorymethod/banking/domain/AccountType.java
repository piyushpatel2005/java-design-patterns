package com.github.piyushpatel2005.factorymethod.banking.domain;

public enum AccountType {
    SAVINGS("savings"),
    CURRENT("current");

    private String type;

    private AccountType(String type) {
        this.type = type;
    }
}
