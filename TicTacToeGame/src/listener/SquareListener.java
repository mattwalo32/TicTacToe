package listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import board.BoardManager;
import board.Square;
import game.Game;

public class SquareListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		Square[][] squares = Game.getBoardManager().getBoard().getSquares();
		BoardManager manager = Game.getBoardManager();
		
		int x = e.getX();
		int y = e.getY();
		
		//TODO make the listener
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
