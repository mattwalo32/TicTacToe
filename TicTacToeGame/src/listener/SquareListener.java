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
		
		for(int i = 0; i < squares.length; i++) {
			for(int j = 0; j < squares[i].length; j++) {
				Square sq = squares[i][j];
				int left = sq.getX();
				int right = left + sq.getWidth();
				int top = sq.getY();
				int bottom = top + sq.getHeight();
				
				if(e.getX() >= left && e.getX() <= right
						&& e.getY() >= top && e.getY() <= bottom) {
					if(manager.getPlayerTurn() == 0) {
						sq.setValueX();
					} else {
						sq.setValueO();
					}
					
					System.out.println("SQUARE [" + i +"][" + j + "] PRESSED");
					manager.getGraphics().repaint();
					manager.nextTurn();
					break;
				}
			}
		}
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
