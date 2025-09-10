package shapes;

import java.awt.Color;
import java.awt.Point;

/**
 * A square defined by its side length (>= 0).
 */
public class Square extends Shape implements Locatable {
	
    private double sideLength;
    private Point location;

    public Square() {
        this(1.0, Color.BLACK, new Point(0, 0));
    }

    public Square(double sideLength, Color color, Point location) {
    	super(color);
        if (sideLength < 0.0) {
            throw new IllegalArgumentException("sideLength must be >= 0");
        }
        
        if (location == null) {
            throw new IllegalArgumentException("location must be defined");
        }
        
        this.sideLength = sideLength;
        this.location = location;
    }
    
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }
    
    @Override
    public Object clone() {
    	return new Square(this.sideLength, this.getColor(), this.location);
    }
    
    @Override
    public String toString() {
    	return "Square: " + " sideLength = " + sideLength 
    			+ " location = (" + location.x + ", " + location.y + ") "
    			+ " area = " + area() + " " + super.toString();
    }

	@Override
	public Point locate() {
		return location;
	}

}
