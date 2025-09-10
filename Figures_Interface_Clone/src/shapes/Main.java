package shapes;

import java.awt.Color;
import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		Square square1 = new Square();
		Square square2 = new Square(5.0, Color.BLUE, new Point(7, 8));
		Square square3 = (Square) square2.clone();
		
		square3.setSideLength(14.0);
		// Change location
		
		System.out.println(square1);
		System.out.println(square2);
		System.out.println(square3);

	}

}
