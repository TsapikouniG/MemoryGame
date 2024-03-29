package assigment.java;
import java.util.Scanner;
public class MemoryGame {


	public static void main(String[] args) {
		int numCards = Integer.parseInt(args[0]);
		
		Board Board = new Board(numCards);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you want to play a game between ComputerPlayer and HumanPlayer ,press 1");
		System.out.println("Do you want to play a game between two humanPlayers ,press 2");
		int answer = input.nextInt();
	
		if(answer == 1) {
			System.out.println("Please give a name to the humanPlayer");
			String human= input.next();
			ComputerPlayer pc = new ComputerPlayer("computerplayer", numCards);
			HumanPlayer hp = new HumanPlayer(human);
			do {
				pc.play(Board);
				hp.play(Board);
				System.out.println("computerplayer ponts: " + pc.getPoints());
				System.out.println(human + " points : " + hp.getHumanPoints());
			}while(!(Board.allPairsFound()));	
			if(pc.getPoints() > hp.getHumanPoints()) {
				System.out.println("The winner is computerPlayer");
			}else if((pc.getPoints() < hp.getHumanPoints())) {
				System.out.println("The winner is " + human );
			}else {
				System.out.println("draw ");
			}
		}else if(answer == 2) {
			System.out.println("Please give a name to the humanPlayer1");
			String human1= input.next();
			HumanPlayer hp = new HumanPlayer(human1);
			System.out.println("Please give a name to the humanPlayer2");
			String human2= input.next();
			HumanPlayer hp2 = new HumanPlayer(human2);
			do {
				hp.play(Board);
				System.out.println("It is " + human2 + "'s turn" );
				hp2.play(Board);
				System.out.println( human1 + " points: " + hp.getHumanPoints());
				System.out.println( human2 + " points: " + hp2.getHumanPoints());
			}while(!(Board.allPairsFound()));	
			if(hp.getHumanPoints() > hp2.getHumanPoints()) {
				System.out.println("The winner is " + human1);
			}else if(hp.getHumanPoints() < hp2.getHumanPoints()){
				System.out.println("The winner is " + human2);
			}else {
				System.out.println("draw");
			}
		}
	}
}




