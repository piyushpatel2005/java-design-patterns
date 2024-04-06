package com.github.piyushpatel2005.proxy.security.domain;

public interface File {
    void download(String user);
    void modify(String user, String content);
}
