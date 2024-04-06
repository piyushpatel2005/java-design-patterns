package pluralsight.bridge.shape2;

import pluralsight.bridge.shape2.model.color.Blue;
import pluralsight.bridge.shape2.model.color.Color;
import pluralsight.bridge.shape2.model.color.Green;
import pluralsight.bridge.shape2.model.color.Red;
import pluralsight.bridge.shape2.model.shape.Circle;
import pluralsight.bridge.shape2.model.shape.Shape;
import pluralsight.bridge.shape2.model.shape.Square;

public class Shape2BridgeDemo {

	public static void main(String[] args) {
		Color blue = new Blue();
		
		Shape square = new Square(blue);
		
		Color red = new Red();
		
		Shape circle = new Circle(red);
		
		Color green = new Green();
		
		Shape greenCircle = new Circle(green);
		
		Shape greenSquare = new Square(green);
		
		square.applyColor();
		circle.applyColor();
		greenCircle.applyColor();
		greenSquare.applyColor();
	}

}
