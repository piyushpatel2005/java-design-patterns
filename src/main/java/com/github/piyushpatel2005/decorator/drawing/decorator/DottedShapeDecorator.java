package com.github.piyushpatel2005.decorator.drawing.decorator;

import com.github.piyushpatel2005.decorator.drawing.domain.Shape;

public class DottedShapeDecorator extends ShapeDecorator {
    private final int dots;
    private final String dotColor;

    public DottedShapeDecorator(Shape decoratedShape, int dots, String dotColor) {
        super(decoratedShape);
        this.dots = dots;
        this.dotColor = dotColor;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" with " + dotColor + " colored " + dots + " dots");
    }
}
