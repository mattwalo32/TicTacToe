package game;

import javax.swing.JFrame;

import board.BoardManager;
import graphics.GameCanvas;
import graphics.GameGraphics;
import listener.SquareListener;

public class Game {
	
	private static BoardManager boardManager;
	private static JFrame window;
	
	
	public static void main(String[] args) {
		boardManager = new BoardManager();
		
		boardManager.generateRandomBoard();
		
		window = new JFrame();
		window.add(boardManager.getGraphics());
		window.setVisible(true);
		window.setSize(500, 500);
		window.addMouseListener(new SquareListener());
	}
	
	public static BoardManager getBoardManager() {
		return boardManager;
	}
	
}
