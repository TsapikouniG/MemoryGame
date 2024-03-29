package assignment2;
import java.util.Scanner;

public class Player {
	
	private Shape[] shapes;
	private double points ;
	private int capacity;
	private String[][] array;
	
	
	public Player(int capacity) {
		this.capacity = capacity;
		this.points = 0;
		shapes = new Shape[capacity];
		array = new String[capacity][2];
		for(int i =0; i <array.length; i ++) {
			array[i][0] = "*";
			array[i][1] = "*";
			}
	}

	public void playShape(Shape shape) {
		Scanner input = new Scanner(System.in);
		System.out.println("Incoming shape" + shape.getType() + ":" + shape.computeArea());
		System.out.println("Do you want to accept?" + "\n" + "press 'y' for yes or 'n' for no" );
		String answer = input.next();
		if(answer.equals("y")){
			double currentPoints;
			if(shapes[shapes.length- capacity] != null && shape.computeArea() == shapes[shapes.length -  capacity].computeArea()) {
				currentPoints = 10*shape.computeArea();
				System.out.println("Added" + currentPoints + "points");
				points += currentPoints;
				System.out.println("Player has" + points + "points");
			}else {
				currentPoints = shape.computeArea();
				System.out.println("Added" + currentPoints + "points");
				points += currentPoints;
				System.out.println("Player has" + points + "points");
				
			}
			if(shapes[shapes.length- capacity] != null && shape.getType().equals(shapes[shapes.length - capacity].getType())) {
				shapes[shapes.length - capacity] = null;
				System.out.println("Top shapes removed");
				capacity ++;
				System.out.println("Player has" + points + "points");
			}else {
				shapes[shapes.length - capacity] = shape;//vazw to shape sthn korufh thw stoivas
				capacity --;
			}
			for(int i =0; i <array.length; i ++) {
				if(array[i][0].equals("*")) {
					array[i][0] = shape.getType();
					array[i][1] = String.valueOf(points);
					break;
				}
			}
			
		}
	}

	public boolean isStackFull() {
		if(capacity == 0 ) {
			System.out.println("stack is full");
			return true;
		}return false;
	}
	public void printStack() {
		System.out.println("Current stack:");
		for(int i=0; i<array.length; i++) {
			if(!(array[i][0].equals("*"))) {
				int z=i+1;
				System.out.println("     " + z + " : " + array[i][0]+ " : " + array[i][1] );
			}	
		}
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}
}
