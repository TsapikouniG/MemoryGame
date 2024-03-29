package assignment2;

public class Square extends Shape{

	public Square(int boundingRectangle) {
		super(boundingRectangle);
	}

	public double computeArea() {
			return getBoundingRectangle();
	}

	public String getType() {
		return "Square";
	}
}
