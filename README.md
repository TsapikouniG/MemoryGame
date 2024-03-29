MemoryGame

 This repository contains the Java implementation of a simplified version of the classic memory card game, as part of an assignment for the Object-Oriented Programming Techniques course at the University of Ioannina. In this game, players match pairs of numbers instead of  images, with support for playing against a computer or another human player.

Game Description

 In the MemoryGame, there are 2*N cards, forming N pairs of numbers from 0 to N-1. These cards are placed face down on the table in a random arrangement. Players take turns to flip two cards at a time. If the cards match, the player collects the cards and earns a point.    The game ends when all pairs are found, and the player with the most points wins.
 
Structure

The implementation is divided into four main classes:
  •	Board.java: Manages the game board, including card placement and status (face-up or face-down).
  
  •	ComputerPlayer.java: Implements the logic for the computer player's moves, including a simple memory mechanism for tracking seen cards.
  
  •	HumanPlayer.java: Handles human player interactions, including choosing cards to flip.
  
  •	MemoryGame.java: Contains the main method and orchestrates the game flow, including initializing the game, handling player turns, and determining the game outcome.
 
 Usage
 
  Start the game by executing the MemoryGame class. The game will prompt for input where necessary, including the number of pairs and whether you want to play against a computer or another human.

