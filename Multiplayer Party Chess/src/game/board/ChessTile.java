package game.board;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ChessTile extends JButton{
	private static final long serialVersionUID = 1L;
	ChessPiece _current_piece;
	int _x;
	int _y;
	static ImageIcon white_tile;
	static ImageIcon black_tile;
	public ChessTile(int x, int y, ChessPiece current_piece) {
		_x = x;
		_y = y;
		//setText("("+x+","+y+")");
		_current_piece = current_piece;
		/*
		setBorderPainted(false);
		setFocusPainted(false);
		setContentAreaFilled(false);
		*/
		/*
		if((_x % 2 == 0 && _y % 2 == 0) {
			
		}
		*/
	}
	public void addPiece(ChessPiece piece) {
		_current_piece = piece;
		//setText(_current_piece.getText());
	}
	public void setImage() {
		if(_current_piece != null && _current_piece.getImage() != null) {
			setIcon(_current_piece.getImage());
		}
	}
}
