package windows;

import java.awt.Dimension;
import java.awt.GridLayout;

import game.board.ChessBoard;
import game.board.pieces.*;
import main.MainWindow;

public class GameWindow extends GeneralWindow{
	private static final long serialVersionUID = 1L;
	ChessBoard _chess_board;
	final String black = "Black_";
	final String white = "White_";
	public GameWindow(MainWindow main_window) {
		super(main_window,false);
		//add(new JLabel("game"));
		setVisible(true);
		
		setMinimumSize(new Dimension(100,200));
		setMaximumSize(new Dimension(100,500));
		setLayout(new GridLayout(8,8));
		
		_chess_board = new ChessBoard(this);
		_chess_board.place(0, 0, new Rook(black));
		_chess_board.place(1, 0, new Knight(black));
		_chess_board.place(2, 0, new Bishop(black));
		_chess_board.place(3, 0, new Queen(black));
		_chess_board.place(4, 0, new King(black));
		_chess_board.place(5, 0, new Bishop(black));
		_chess_board.place(6, 0, new Knight(black));
		_chess_board.place(7, 0, new Rook(black));

		_chess_board.place(0, 7, new Rook(white));
		_chess_board.place(1, 7, new Knight(white));
		_chess_board.place(2, 7, new Bishop(white));
		_chess_board.place(3, 7, new Queen(white));
		_chess_board.place(4, 7, new King(white));
		_chess_board.place(5, 7, new Bishop(white));
		_chess_board.place(6, 7, new Knight(white));
		_chess_board.place(7, 7, new Rook(white));
		
		for(int i = 0; i < 8; i++) {
			_chess_board.place(i, 6, new Pawn(white));
			_chess_board.place(i, 1, new Pawn(black));
		}
		
	}
}
