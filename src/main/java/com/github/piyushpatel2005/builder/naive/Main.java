package com.github.piyushpatel2005.builder.naive;

public class Main {
    public static void main(String[] args) {
        System.out.println("Create Burger with tomatoes only");
        Burger burger = new Burger(true);

        System.out.println("Create burger with tomatoes and lettuce");
        Burger burger2 = new Burger(false, true, true);

        System.out.println("Create burger with onion and tomatoes");
        Burger burger3 = new Burger(true, true);
    }
}
