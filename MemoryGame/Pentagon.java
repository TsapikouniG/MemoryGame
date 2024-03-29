package assignment2;

public class Pentagon extends Shape {

	public Pentagon(int boundingRectangle) {
		super(boundingRectangle);
	}
	
	public double computeArea() {
		return (3/4)*getBoundingRectangle();
	}

	public String getType() {
		return "Pentagon";
	}

}
