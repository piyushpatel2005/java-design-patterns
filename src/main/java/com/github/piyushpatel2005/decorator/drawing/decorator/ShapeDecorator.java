package com.github.piyushpatel2005.decorator.drawing.decorator;

import com.github.piyushpatel2005.decorator.drawing.domain.Shape;

public abstract class ShapeDecorator implements Shape {
    private Shape decoaratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoaratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoaratedShape.draw();
    }
}
