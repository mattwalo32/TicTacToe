package game;

import javax.swing.JFrame;

import board.BoardManager;
import board.Square;
import graphics.GameCanvas;
import graphics.GameGraphics;
import listener.SquareListener;

public class Game {
	
	private static BoardManager boardManager;
	private static JFrame window;
	
	
	public static void main(String[] args) {
		boardManager = new BoardManager();
		
		boardManager.generateRandomBoard();
		
		detectWinner();
		
		window = new JFrame();
		window.add(boardManager.getGraphics());
		window.setVisible(true);
		window.setSize(500, 500);
		window.addMouseListener(new SquareListener());
	}
	
	public static BoardManager getBoardManager() {
		return boardManager;
	}
	
	private static void detectWinner() {
		Square[][] squares = boardManager.getBoard().getSquares();
		for (int i = 0; i < squares.length; i++) {
				if (squares[i][0].equals(squares[i][1]) && squares[i][0].equals(squares[i][2])) {
					System.out.println("Goodie");
					
					
				}
			
		}
		for (int j = 0; j < squares.length; j++) {
			if (squares[0][j].equals(squares[1][j]) && squares[0][j].equals(squares[2][j])) {
				System.out.println("Oofie");
				
				
			}
		
	    }
		
		
	}
	
	private void printWinner(String winner) {
		System.out.println(winner + "has won.");
	}
	
}
