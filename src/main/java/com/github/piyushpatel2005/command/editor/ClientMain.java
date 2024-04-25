package com.github.piyushpatel2005.command.editor;

import com.github.piyushpatel2005.command.editor.domain.Document;
import com.github.piyushpatel2005.command.editor.domain.WordDocument;

public class ClientMain {
    public static void main(String[] args) {
        Document wordDoc = new WordDocument();
        wordDoc.open();
        wordDoc.write("Hello World!!! ");
        wordDoc.write("Hi there! ");
        System.out.println("Content: " + wordDoc.getContent());
        wordDoc.undo();
        System.out.println("Content: " + wordDoc.getContent());
        wordDoc.write("How are you?");
        System.out.println("Content: " + wordDoc.getContent());
        wordDoc.undo();
        System.out.println("Content: " + wordDoc.getContent());
    }
}
