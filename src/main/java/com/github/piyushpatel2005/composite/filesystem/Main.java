package com.github.piyushpatel2005.composite.filesystem;

import com.github.piyushpatel2005.composite.filesystem.domain.Directory;
import com.github.piyushpatel2005.composite.filesystem.domain.File;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory someuser = new Directory("someuser");
        Directory music = new Directory("music");
        Directory documents = new Directory("documents");

        File file1 = new File("user.txt", 100);
        File file2 = new File("user_another.txt", 200);
        File file3 = new File("music.mp4", 300);
        File file4 = new File("doc.docx", 400);
        File file5 = new File("resume.pdf", 500);

        root.addComponent(home);
        home.addComponent(someuser);
        someuser.addComponent(music);
        someuser.addComponent(documents);

        someuser.addComponent(file1);
        someuser.addComponent(file2);
        music.addComponent(file3);
        documents.addComponent(file4);
        documents.addComponent(file5);

        System.out.println("Size of someuser directory: " + someuser.getSize() + " bytes");
        System.out.println("Size of music directory: " + music.getSize() + " bytes");
        System.out.println("Size of documents directory: " + documents.getSize() + " bytes");
    }
}
