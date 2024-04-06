package com.github.piyushpatel2005.bridge.solution.shapes.domain.shape;

import com.github.piyushpatel2005.bridge.solution.shapes.domain.color.Color;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}
	
	@Override
	public void paint() {
		color.apply();
	}

}
