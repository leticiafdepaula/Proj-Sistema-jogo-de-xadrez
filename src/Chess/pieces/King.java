package Chess.pieces;

import Boardgame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class King {

	public class king extends ChessPiece {

		public king(Board board, Color color) {
			super(board, color);

		}

		@Override
		public boolean[][] possibleMoves() {
			boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
			return mat;

		}

	}

	public King(Board board, Color black) {

	}

	@Override
	public String toString() {
		return "K";

	}



}
