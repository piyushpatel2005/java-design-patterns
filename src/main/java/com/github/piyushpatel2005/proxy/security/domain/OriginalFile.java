package com.github.piyushpatel2005.proxy.security.domain;

public class OriginalFile implements File {
    private String fileName;

    public OriginalFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void download(String user) {
        System.out.println("Downloading file for user " + user);
    }

    @Override
    public void modify(String user, String content) {
        System.out.println("Modifying file for user " + user);
    }
}
