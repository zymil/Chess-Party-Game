package game.board;

import java.util.ArrayList;

import javax.swing.JPanel;

import main.ScaledImage;

public class ChessBoard{
	ArrayList<ArrayList<ChessTile>> _inner_array;
	public ChessBoard(JPanel game_panel) {
		//Initialize images
		ChessTile.white_tile = ScaledImage.scale("White_Tile.png");
		ChessTile.black_tile = ScaledImage.scale("Black_Tile.png");
		
		_inner_array = new ArrayList<ArrayList<ChessTile>>(); 
		for(int i = 0; i < 8; i++) {
			_inner_array.add(new ArrayList<ChessTile>());
			for(int j = 0; j < 8; j++) {
				_inner_array.get(i).add(j, new ChessTile(j,i,null));
			}
		}
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				game_panel.add(_inner_array.get(j).get(i));
			}
		}
	}
	public void place(int x, int y, ChessPiece piece) {
		_inner_array.get(x).get(y).addPiece(piece);
		_inner_array.get(x).get(y).setImage();
	}
	/*
	public void setAt(int x, int y, ChessSlot obj) {
		if(x > 7 || y > 7 || x < 0 || y < 0) {
			System.out.println("Cannot setAt x: "+x+" y:"+y);
		}else {
			_inner_array.get(x).remove(y);
			_inner_array.get(x).add(y, obj);
		}
	}
	public ChessSlot getAt(int x, int y) {
		if(x > 7 || y > 7 || x < 0 || y < 0) {
			System.out.println("Cannot getAt x: "+x+" y:"+y);
			return null;
		}else {
			return _inner_array.get(x).get(y);
		}
	}
	*/
}
