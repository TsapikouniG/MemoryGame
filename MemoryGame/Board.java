//gewrgia tsapikouni 
//a.m:4304

package assigment.java;
import java.util.Random;

public class Board {
	
	private int[] board;
	private int numCards;
	private int avbCards;
	private Random rand;
	
	public Board(int numCards) {
		
		this.rand = new Random();
		this.numCards = 2*numCards;
		this.avbCards = this.numCards;
		this.board = new int[this.numCards];
		int counter = 0;
		for(int i=0; i<this.numCards; i+=2) {
			board[i] = counter;
			board[i+1] = counter;
			counter ++;
		}
		
		for (int i = 0; i < board.length; i++) {
			int randomIndexToSwap = rand.nextInt(board.length) ;
			int temp = board[randomIndexToSwap];
			board[randomIndexToSwap] = board[i];
			board[i] = temp;
		}
		
	}
	
	public void print() {
		printHeader();
		printAvbCards();
	}
	
	public void flash(int pos1, int pos2) {
		printHeader();
		
		String dispString = " ";
		for(int i=0; i<board.length; i++) {
			if(i == pos1 || i == pos2) {
				dispString += board[i] + " ";
			}else {
				if(board[i] != -1) {
					dispString += "* ";
				}else {
					dispString += " ";
				}
			}
		}
		System.out.print(dispString);
		
		delay(2);
		System.out.print("\r ");
		
		printAvbCards();
	}
	
	public boolean openPositions(int pos1, int pos2) {
		int card1 = board[pos1];
		int card2 = board[pos2];
		if(card1 == card2) {
			System.out.println("Found pair ("+card1 +","+ card2+")");
			board[pos1] = -1;
			board[pos2] = -1;
			print();
			return true;
		}else {
			flash(pos1, pos2);
			return false;
		}
		
	}

	public int getRandomPosition() {
		int pos;
		do {
			pos = rand.nextInt(board.length);
		}while(board[pos] == -1);
		return board[pos];
	}
	public int getNumCards() {
		return board[numCards];
	}
	public int getRandomPosition(int pos) {
		int pos2;
		do {
			pos2 = rand.nextInt(board.length);
		}while(board[pos2] == -1 || pos2 == pos);
		return board[pos2];
	}
	
	public boolean containsCard(int pos) {
		return !(board[pos] == -1);
		
	}
	
	public int getCard(int pos) {
		return board[pos];
	}
	
	public boolean allPairsFound() {
		for(int i=0; i<board.length; i++) {
			if(board[i] != -1)
				return false;
		}
		return true;
	}
	
	public boolean getAllPairsFound() {
		return allPairsFound();
	}
	
	private void printHeader() {
		String header = " ";
		for(int i=0; i<board.length; i++) {
			header += String.valueOf(i);
			header += " ";
		}
		header += "\n-----------------------\n";
		System.out.print(header);
	}
	
	private void printAvbCards() {
		String header = "";
		for(int i=0; i<board.length; i++) {
			if(board[i] != -1) {
				header += "* ";
			}else {
				header += " ";
			}
		}
		System.out.println(header);
	}
	
	private void delay(int sec){
		try {
			Thread.currentThread().sleep(1000*sec);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		Board brd = new Board(3);
		brd.openPositions(4,5);
		int randPos = brd.getRandomPosition();
		int randPos2 = brd.getRandomPosition(randPos);
	}
}
