package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPeace extends Piece{

	private Color color;

	public ChessPeace(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
