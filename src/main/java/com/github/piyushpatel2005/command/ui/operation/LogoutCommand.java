package com.github.piyushpatel2005.command.ui.operation;

import com.github.piyushpatel2005.command.ui.domain.Button;

public class LogoutCommand implements Command {
    private final Button button;

    public LogoutCommand(Button button) {
        this.button = button;
    }

    @Override
    public void execute() {
        button.click();
    }
}
