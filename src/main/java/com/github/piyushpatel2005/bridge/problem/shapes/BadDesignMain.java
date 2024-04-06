package com.github.piyushpatel2005.bridge.problem.shapes;

import com.github.piyushpatel2005.bridge.problem.shapes.domain.circle.BlueCircle;
import com.github.piyushpatel2005.bridge.problem.shapes.domain.circle.Circle;
import com.github.piyushpatel2005.bridge.problem.shapes.domain.square.PurpleSquare;
import com.github.piyushpatel2005.bridge.problem.shapes.domain.square.RedSquare;
import com.github.piyushpatel2005.bridge.problem.shapes.domain.square.Square;

public class BadDesignMain {

	public static void main(String args[]) {

		Circle circle = new BlueCircle();

		Square square = new RedSquare();
		
		Square greenSquare = new PurpleSquare();

		circle.paint();
		square.paint();
		greenSquare.paint();
	}

}
