package assignment2;
import java.util.Scanner;

public class ShapeGame {

	public static void main(String[] args) {
		System.out.println("Give the number of shapes per type");
		Scanner input = new Scanner(System.in);
		int numShape =input.nextInt();
		System.out.println("Give the size of the stack for the player");
		int capacity =input.nextInt();
		ShapeGenerator myShapeGenerator = new ShapeGenerator(numShape);
		Player myPlayer = new Player(capacity);
		String a ;
		do {
			int counter = (int)Math.floor(Math.random()*(4*numShape));
			a = myShapeGenerator.getShapeBoardType(counter);
			if(a.equals("Square")){
				Shape shape =  new Square(myShapeGenerator.getIndex());
				myPlayer.playShape(shape);
				myPlayer.printStack();
				myPlayer.getPoints();
			}
			if(a.equals("Circle")){
				Shape shape =  new Circle(myShapeGenerator.getIndex());
				myPlayer.playShape(shape);
				myPlayer.printStack();
				myPlayer.getPoints();
			}
			if(a.equals("Triangle")){
				Shape shape =  new Triangle(myShapeGenerator.getIndex());
				myPlayer.playShape(shape);
				myPlayer.printStack();
				myPlayer.getPoints();
			}
			if(a.equals("Pentagon")){
				Shape shape =  new Pentagon(myShapeGenerator.getIndex());
				myPlayer.playShape(shape);
				myPlayer.printStack();
				myPlayer.getPoints();
			}
		}while(myShapeGenerator.hasShape() && !(myPlayer.isStackFull()));
		System.out.println("Game over");
	}
}
