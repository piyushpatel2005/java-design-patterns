package com.github.piyushpatel2005.command.ui.domain;

public class LogoutButton implements Button {
    @Override
    public void click() {
        System.out.println("Logout button clicked");
    }
}
