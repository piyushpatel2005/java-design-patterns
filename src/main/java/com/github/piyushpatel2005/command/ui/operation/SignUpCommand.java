package com.github.piyushpatel2005.command.ui.operation;

import com.github.piyushpatel2005.command.ui.domain.Button;

public class SignUpCommand implements Command {
    private final Button button;

    public SignUpCommand(Button button) {
        this.button = button;
    }

    @Override
    public void execute() {
        button.click();
    }
}
