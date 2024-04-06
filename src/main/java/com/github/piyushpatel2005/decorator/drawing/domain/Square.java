package com.github.piyushpatel2005.decorator.drawing.domain;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
