package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class GameCanvas extends JComponent {
	
	private static final Color COLOR_NEUTRAL = Color.WHITE;
	private static final Color COLOR_X = Color.RED;
	private static final Color COLOR_O = Color.BLUE;
	
	private Game m_callingGame;
	
	public GameCanvas(Game p_game) {
		m_callingGame = p_game;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintSquares(g);
	}
	
	private void paintSquares(Graphics g) {
		
	}
	
}
