package board;

import graphics.GameCanvas;

public class BoardManager {

	private static final int BOARD_SIZE = 3;
	private static GameCanvas graphics;
	private int m_playerTurn = 0;
	
	//Board object owned by BoardManager
	private Board m_board;
	
	//Constructor
	public BoardManager() {
		m_board = new Board(BOARD_SIZE);
		graphics = new GameCanvas(this);
	}
	
	public Board getBoard() {
		return m_board;
	}
	
	public GameCanvas getGraphics() {
		return graphics;
	}
	
	public int getPlayerTurn() {
		return m_playerTurn;
	}
	
	public void nextTurn() {
		m_playerTurn ++;
		m_playerTurn %= 2;
	}
}
