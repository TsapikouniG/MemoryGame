package assignment2;
//TSAPIKOUNI GEORGIA
//A.M:4304


public abstract class Shape {
	
	private int boundingRectangle;

	public Shape(int boundingRectangle) {
		this.boundingRectangle = boundingRectangle;
	}
	
	public abstract double computeArea();
	
	public abstract  String getType();
	
	public boolean sameArea(Shape other) {
		return this.computeArea() == other.computeArea();
	}
	
	public boolean sameType(Shape other) {
		return this.getType().equals(other.getType());
	}
	
	public String toString() {
		return "area: " + computeArea() + " /// " + "type: " + getType();
	}

	public int getBoundingRectangle() {
		return boundingRectangle;
	}

	public void setBoundingRectangle(int boundingRectangle) {
		this.boundingRectangle = boundingRectangle;
	}	
}

