package com.github.piyushpatel2005.command.ui;

import com.github.piyushpatel2005.command.ui.domain.Button;
import com.github.piyushpatel2005.command.ui.domain.LoginButton;
import com.github.piyushpatel2005.command.ui.domain.LogoutButton;
import com.github.piyushpatel2005.command.ui.domain.SignUpButton;
import com.github.piyushpatel2005.command.ui.operation.Command;
import com.github.piyushpatel2005.command.ui.operation.SignUpCommand;

public class Main {
    public static void main(String[] args) {
        Button signupButton = new SignUpButton();
        Button loginButton = new LoginButton();
        Button logoutButton = new LogoutButton();

        Command signupCommand = new SignUpCommand(signupButton);
        Command loginCommand = new SignUpCommand(loginButton);
        Command logoutCommand = new SignUpCommand(logoutButton);

        signupCommand.execute();
        loginCommand.execute();
        logoutCommand.execute();
    }
}
