package com.github.piyushpatel2005.builder.simple.burger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Create Burger with tomatoes only");
        Burger burger = new Burger.Builder()
                .withBread("Wheat")
                .withTomatoes()
                .build();
        System.out.println(burger);

        System.out.println("Create burger with tomatoes, lettuce and cheese");
        burger = new Burger.Builder()
                .withBread("Wheat")
                .withTomatoes()
                .withLettuce()
                .withCheese()
                .build();
        System.out.println(burger);
    }
}
