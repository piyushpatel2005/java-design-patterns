package com.github.piyushpatel2005.proxy.security;

import com.github.piyushpatel2005.proxy.security.domain.File;
import com.github.piyushpatel2005.proxy.security.domain.OriginalFile;

public class Main {
    public static void main(String[] args) {
        SecurityProxy securityProxy = new SecurityProxy("file1.txt");

        securityProxy.download("someuser");
        securityProxy.modify("admin", "some new conent");
        securityProxy.modify("anotheruser", "the latest content");
    }
}
