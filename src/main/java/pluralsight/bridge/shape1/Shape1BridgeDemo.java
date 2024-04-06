package pluralsight.bridge.shape1;

import pluralsight.bridge.shape1.model.circle.BlueCircle;
import pluralsight.bridge.shape1.model.circle.Circle;
import pluralsight.bridge.shape1.model.square.GreenSquare;
import pluralsight.bridge.shape1.model.square.RedSquare;
import pluralsight.bridge.shape1.model.square.Square;

public class Shape1BridgeDemo {

	public static void main(String args[]) {

		Circle circle = new BlueCircle();

		Square square = new RedSquare();
		
		Square greenSquare = new GreenSquare();

		circle.applyColor();
		square.applyColor();
		greenSquare.applyColor();
	}

}
