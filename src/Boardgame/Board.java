package Boardgame;

import Chess.pieces.King;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	private Position position;
	private Piece piece;
	private int row;
	private int column;

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro creating board: there must be at least 1 row and 1 column");

		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];

	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}

		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
	 if (thereIsAPiece(position)) {
		 throw new BoardException("There is already a piece on position " + position);
	 }
	
	pieces[position.getRow()][position.getColumn()] = piece;
	piece.position = position;
	
	
	}
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());

	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}

		return piece(position) != null;

	}

	public void placePiece(King king, Position position2) {
		// TODO Auto-generated method stub

	}

}
