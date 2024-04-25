package com.github.piyushpatel2005.command.editor.operation;

import com.github.piyushpatel2005.command.editor.domain.Document;
import com.github.piyushpatel2005.command.editor.domain.WordDocument;

public class WriteCommand implements Command {
    private final WordDocument document;
    public final String text;
    private String previousText;

    public WriteCommand(WordDocument document, String text) {
        this.document = document;
        this.text = text;
        this.previousText = document.getContent();
    }

    @Override
    public void execute() {
        System.out.println("Executing write command for text: " + text);
        previousText = document.getContent();
        document.write(text);
    }

    @Override
    public void undo() {
        System.out.println("Undoing write command for text: " + text);
        document.setContent(document.getContent().replace(document.getContent(), previousText));
    }
}
