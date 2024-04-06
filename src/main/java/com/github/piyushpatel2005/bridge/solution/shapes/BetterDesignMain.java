package com.github.piyushpatel2005.bridge.solution.shapes;

import com.github.piyushpatel2005.bridge.solution.shapes.domain.color.Blue;
import com.github.piyushpatel2005.bridge.solution.shapes.domain.color.Color;
import com.github.piyushpatel2005.bridge.solution.shapes.domain.color.Green;
import com.github.piyushpatel2005.bridge.solution.shapes.domain.color.Red;
import com.github.piyushpatel2005.bridge.solution.shapes.domain.shape.Circle;
import com.github.piyushpatel2005.bridge.solution.shapes.domain.shape.Shape;
import com.github.piyushpatel2005.bridge.solution.shapes.domain.shape.Square;

public class BetterDesignMain {

	public static void main(String[] args) {
		Color blue = new Blue();
		
		Shape square = new Square(blue);
		
		Color red = new Red();
		
		Shape circle = new Circle(red);
		
		Color green = new Green();
		
		Shape greenCircle = new Circle(green);
		
		Shape greenSquare = new Square(green);
		
		square.paint();
		circle.paint();
		greenCircle.paint();
		greenSquare.paint();
	}

}
