package com.github.piyushpatel2005.singleton.logger;

public class Logger {
    private static Logger instance;

    private Logger() {
        if (instance != null) {
            System.out.println("Logger instance already exists");
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
