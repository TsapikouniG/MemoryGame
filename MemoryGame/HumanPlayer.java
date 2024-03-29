package assigment.java;
import java.util.Scanner;

public class HumanPlayer {
	
	private String nameHuman;
	private int humanPoints = 0;
	
	public HumanPlayer(String nameHuman) {
		this.nameHuman = nameHuman;
	}
	
	public void play(Board bo) {
		Scanner input = new Scanner(System.in);
		int pos1 ;
		int pos2 ;
	
		do {
			System.out.println("give me two positions to open:");
			pos1 = input.nextInt();
			pos2 = input.nextInt();
		}while((pos1 == pos2) || (!(bo.containsCard(pos1))) || (!(bo.containsCard(pos2))));
		if(bo.openPositions(pos1, pos2) == true) {
			 humanPoints++;
		}	
	}
	
	public int getHumanPoints() { 
		return humanPoints;
	}
	
	public String toString() {
		return nameHuman;
	}
	
	public static void main(String[] args) {
		Board bo = new Board(9);
		HumanPlayer hp  = new HumanPlayer("maria");
		hp.play(bo);
		hp.getHumanPoints();
	}
}
