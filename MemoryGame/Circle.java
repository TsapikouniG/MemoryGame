package assignment2;

public class Circle extends Shape{

	public Circle(int boundingRectangle) {
		super(boundingRectangle);
	}
	
	public double computeArea() {
		
		return ( Math.PI/4)*getBoundingRectangle();
	}

	public String getType() {
		return "Circle";
	}

}
