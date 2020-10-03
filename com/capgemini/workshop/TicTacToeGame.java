package com.capgemini.workshop;

public class TicTacToeGame {		


	public static void main(String[] args) {
		
		TicTacToeGame game = new TicTacToeGame();
		game.createBoardAssignEmpty();
		
	}

	// Create Board
	private void createBoardAssignEmpty() {
		char [] board = new char[10];
		for(int i=1; i<10; i++)
		{
			board[i] = ' ';
		}
	}

}
