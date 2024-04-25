package com.github.piyushpatel2005.command.editor.domain;

import com.github.piyushpatel2005.command.editor.operation.Command;

import java.util.Stack;

public class History {
    private Stack<Command> undoStack;
    private Stack<Command> redoStack;

    public History() {
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void push(Command command) {
        undoStack.push(command);
        redoStack.clear(); // Clear redo stack on new command
    }

    public Command pop() {
        Command command = undoStack.pop();
        redoStack.push(command);
        return command;
    }

    public boolean canUndo() {
        return !undoStack.isEmpty();
    }

    public boolean canRedo() {
        return !redoStack.isEmpty();
    }

    public Command redo() {
        return redoStack.pop();
    }
}
