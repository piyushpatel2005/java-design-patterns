package com.github.piyushpatel2005.decorator.drawing.domain;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
