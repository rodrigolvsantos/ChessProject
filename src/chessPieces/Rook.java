package chessPieces;

import boardgame.Board;
import chess.ChessPeace;
import chess.Color;

public class Rook extends ChessPeace{

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString () {
		return "R";
	}
	
}
