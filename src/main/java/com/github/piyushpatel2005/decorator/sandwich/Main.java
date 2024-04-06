package com.github.piyushpatel2005.decorator.sandwich;

import com.github.piyushpatel2005.decorator.sandwich.decorator.ExtraCheeseDecorator;
import com.github.piyushpatel2005.decorator.sandwich.decorator.VegetableDecorator;
import com.github.piyushpatel2005.decorator.sandwich.domain.Sandwich;
import com.github.piyushpatel2005.decorator.sandwich.domain.SimpleCheeseSandwich;

public class Main {
    public static void main(String[] args) {
        Sandwich sandwich = new SimpleCheeseSandwich();
        System.out.println(sandwich.getDescription() + " costs $" + sandwich.getPrice());

        sandwich = new ExtraCheeseDecorator(sandwich);
        System.out.println(sandwich.getDescription() + " costs $" + sandwich.getPrice());

        sandwich = new VegetableDecorator(sandwich, "tomato", 0.99);
        System.out.println(sandwich.getDescription() + " costs $" + sandwich.getPrice());

        sandwich = new VegetableDecorator(sandwich, "lettuce", 0.49);
        System.out.println(sandwich.getDescription() + " costs $" + sandwich.getPrice());
    }
}
