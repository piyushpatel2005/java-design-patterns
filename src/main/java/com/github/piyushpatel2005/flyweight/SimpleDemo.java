package com.github.piyushpatel2005.flyweight;

public class SimpleDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        System.out.println(s1 == s2);

        Integer int1 = Integer.valueOf(10);
        Integer int2 = Integer.valueOf(10);
        System.out.println(int1 == int2);
        System.out.println(System.identityHashCode(int1));
        System.out.println(System.identityHashCode(int2));
    }
}
