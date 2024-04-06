package com.github.piyushpatel2005.bridge.solution.shapes.domain.shape;

import com.github.piyushpatel2005.bridge.solution.shapes.domain.color.Color;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void paint();
}
