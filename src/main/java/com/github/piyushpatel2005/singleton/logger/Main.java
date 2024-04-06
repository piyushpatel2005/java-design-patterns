package com.github.piyushpatel2005.singleton.logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Hello World");

        // Even if we try to create new instance, it returns the same instance of the class.
        Logger logger2 = Logger.getInstance();
        System.out.println(logger == logger2);
    }
}
