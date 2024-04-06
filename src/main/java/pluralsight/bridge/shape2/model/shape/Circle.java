package pluralsight.bridge.shape2.model.shape;

import pluralsight.bridge.shape2.model.color.Color;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
