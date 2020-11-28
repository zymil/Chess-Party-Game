package game.board;

import javax.swing.ImageIcon;

import main.ScaledImage;

public class ChessPiece {
	protected int empty = 0;
	ChessTile _current_slot;
	String _text;
	String _black_or_white;
	static ImageIcon _img;
	public ChessPiece(String black_or_white) {
		_text = "";
		_black_or_white = black_or_white;
	}
	protected String getText() {
		return _text;
	}
	public String getTeam() {
		return _black_or_white;
	}
	public ImageIcon getImage() {
		return _img;
	}
	//Called before the specific pieces' cosntructor ends
	protected void setText(String text) {
		_text = text;
		_img = ScaledImage.scale(getTeam()+getText()+".png");
	}
}
