package com.github.piyushpatel2005.command.editor.operation;

public interface Command {
    void execute();
    void undo();
}