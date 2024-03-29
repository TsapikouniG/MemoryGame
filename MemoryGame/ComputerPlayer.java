package assigment.java;

public class ComputerPlayer {
	
	private String name;
	private int[] cardsMemory;
	private int points;
	
	public ComputerPlayer(String name, int numCards) {
		this.name = name;
		this.cardsMemory = new int[numCards];
		for(int i=0; i<numCards; i++) {
			cardsMemory[i] = -1;
		}
		this.points = 0;
	}
	
	public void play(Board board) {
		int pos1 = board.getRandomPosition();
		int card1 = board.getCard(pos1);
		int pos2 ;
		int card2;

		if(cardsMemory[card1] != -1) {
			pos2 = cardsMemory[card1];
			card2 = board.getCard(pos2);
		}else {
			pos2 = board.getRandomPosition(pos1);
			card2 = board.getCard(pos2);
		}

		if( board.openPositions(pos1, pos2) ) {
			points ++;
		}else {
			cardsMemory[card1] = pos1;
			cardsMemory[card2] = pos2;
		}
	}
	
	public int getPoints() { 
		return points; 
	}
	
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		Board board = new Board(5);
		ComputerPlayer pc = new ComputerPlayer("HALL", 5);
		pc.play(board);
		pc.getPoints();
	}
}
