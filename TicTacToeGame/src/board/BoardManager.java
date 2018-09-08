package board;
public class BoardManager {

	private static final int BOARD_SIZE = 3;
	
	//Board object owned by BoardManager
	private Board m_board;
	
	//Constructor
	public BoardManager() {
		m_board = new Board(BOARD_SIZE);
	}
	
	private Board getBoard() {
		return m_board;
	}
	
}
