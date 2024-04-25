package com.github.piyushpatel2005.command.editor.domain;

import com.github.piyushpatel2005.command.editor.operation.Command;
import com.github.piyushpatel2005.command.editor.operation.WriteCommand;

public class WordDocument implements Document {
    private StringBuilder content;
    private History history;

    public WordDocument() {
        content = new StringBuilder();
        history = new History();
    }

    @Override
    public void open() {
        System.out.println("Document opened.");
    }

    @Override
    public void save() {
        System.out.println("Document saved.");
    }

    @Override
    public void write(String content) {
        this.history.push(new WriteCommand(this, content));
        this.content.append(content);
    }

    @Override
    public void undo() {
        if (history.canUndo()) {
            history.pop().undo();
        }
    }

    @Override
    public void redo() {
        if (history.canRedo()) {
            history.redo().execute();
        }
    }

    public String getContent() {
        return content.toString();
    }

    public void setContent(String content) {
        this.content = new StringBuilder(content);
    }
}
