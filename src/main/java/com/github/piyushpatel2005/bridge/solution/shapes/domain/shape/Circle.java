package com.github.piyushpatel2005.bridge.solution.shapes.domain.shape;

import com.github.piyushpatel2005.bridge.solution.shapes.domain.color.Color;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}
	
	@Override
	public void paint() {
		color.apply();
	}

}
