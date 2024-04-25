package com.github.piyushpatel2005.command.editor.domain;

public interface Document {
    void open();
    void write(String input);
    void save();
    void undo();
    void redo();
    String getContent();
}
