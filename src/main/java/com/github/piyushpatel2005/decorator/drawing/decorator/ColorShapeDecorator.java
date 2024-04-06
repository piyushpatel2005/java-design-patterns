package com.github.piyushpatel2005.decorator.drawing.decorator;

import com.github.piyushpatel2005.decorator.drawing.domain.Shape;

public class ColorShapeDecorator extends ShapeDecorator {
    private final String color;

    public ColorShapeDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" with Color: " + color);
    }
}
