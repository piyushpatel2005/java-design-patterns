package pluralsight.bridge.shape2.model.shape;

import pluralsight.bridge.shape2.model.color.Color;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
