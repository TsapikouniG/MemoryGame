package assignment2;

public class Triangle extends Shape {
	
	public Triangle(int boundingRectangle) {
		super(boundingRectangle);
	}

	public double computeArea() {
			return (1/2)*getBoundingRectangle();
	}

	public String getType() {
		return "Triangle";
	}

}
