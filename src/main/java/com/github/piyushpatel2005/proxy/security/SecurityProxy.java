package com.github.piyushpatel2005.proxy.security;

import com.github.piyushpatel2005.proxy.security.domain.File;
import com.github.piyushpatel2005.proxy.security.domain.OriginalFile;
import com.github.piyushpatel2005.proxy.security.service.AuthenticationService;

public class SecurityProxy implements File {
    private File file;

    public SecurityProxy(String fileName) {
        this.file = new OriginalFile(fileName);
    }

    @Override
    public void download(String user) {
        if (AuthenticationService.authenticateDownload(user)) {
            file.download(user);
        } else {
            System.out.println("You are not authorized to download this file");
        }
    }

    @Override
    public void modify(String user, String content) {
        if (AuthenticationService.authenticateModify(user)) {
            file.modify(user, content);
        } else {
            System.out.println("You are not authorized to modify this file");
        }
    }
}
