package com.github.piyushpatel2005.decorator.drawing;

import com.github.piyushpatel2005.decorator.drawing.decorator.ColorShapeDecorator;
import com.github.piyushpatel2005.decorator.drawing.decorator.DottedShapeDecorator;
import com.github.piyushpatel2005.decorator.drawing.domain.Circle;
import com.github.piyushpatel2005.decorator.drawing.domain.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape blueCircle = new ColorShapeDecorator(circle, "blue");
        blueCircle.draw();

        Shape dottedBlueCircle = new DottedShapeDecorator(blueCircle, 100, "red");
        dottedBlueCircle.draw();
    }
}
