package pluralsight.bridge.shape2.model.shape;

import pluralsight.bridge.shape2.model.color.Color;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
