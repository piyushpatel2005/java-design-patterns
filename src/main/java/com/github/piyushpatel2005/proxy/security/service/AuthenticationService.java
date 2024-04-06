package com.github.piyushpatel2005.proxy.security.service;

import java.util.Arrays;
import java.util.List;

public class AuthenticationService {
    private static final List<String> READ_PERMITTED_USERS = Arrays.asList("someuser", "admin", "anotheruser");
    private static final List<String> MODIFICATION_PERMITTED_USERS = Arrays.asList("admin");

    public static boolean authenticateDownload(String user) {
        return READ_PERMITTED_USERS.contains(user);
    }

    public static boolean authenticateModify(String user) {
        return MODIFICATION_PERMITTED_USERS.contains(user);
    }
}
