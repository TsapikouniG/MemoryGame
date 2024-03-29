package assignment2;

import java.util.Random;

public class ShapeGenerator {
	
	private Shape[] shapeBoard ;
	private int [] arr = {1,2,3,4,8,12,16};
	private int numShape ;
	private int index;
	
	
	public ShapeGenerator(int numShape) {
		this.numShape = numShape;
		this.shapeBoard = new Shape[this.numShape*4];
		initializeShapes();
		
	}

	private void initializeShapes() {

		int counter = 0;
		Random rd = new Random(); 
		for (int i = 0; i < numShape; i++) {
			index = rd.nextInt(arr.length);
			shapeBoard[counter] = new Pentagon(arr[index]);
			counter ++;
		}
		for (int i = 0; i < numShape; i++) {
			index = rd.nextInt(arr.length);
			shapeBoard[counter] = new Circle(arr[index]);
			counter ++;
		}
		for (int i = 0; i < numShape; i++) {
			index = rd.nextInt(arr.length);
			shapeBoard[counter] = new Square(arr[index]);
			counter ++;
		}
		for (int i = 0; i < numShape; i++) {
			index = rd.nextInt(arr.length);
			shapeBoard[counter] = new Triangle(arr[index]);
			counter ++;
		}
	}	
	
	public Shape nextShape() {
		int a;
		Shape removedShape;
		do {
			a = new Random().nextInt(shapeBoard.length);
			removedShape = shapeBoard[a];
		}while(shapeBoard[a] ==  null);
		shapeBoard[a] = null;
		return removedShape;
	}
	
	public boolean hasShape() {
		for (int i = 0; i < shapeBoard.length; i++){
			if(shapeBoard[i] != null) {
				return true;
			}
		}return false;
	}
	
	public String toString() {
		String ar = "";
		for (int i =0; i< shapeBoard.length; i++) {
			if(shapeBoard[i] != null)
				ar += shapeBoard[i] + "";
		}
		return ar;
	}
	public int getIndex() {
		return index;
	}
	
	public String getShapeBoardType(int i) {
		return shapeBoard[i].getType();
	}
	
	public static void main(String args[]) {
		ShapeGenerator myShapeGenerator = new ShapeGenerator(2); 
		do {
			System.out.println(myShapeGenerator.nextShape());
			System.out.println(myShapeGenerator.toString());
		}while(myShapeGenerator.hasShape() == true);
	}
}
