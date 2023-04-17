package Chess;

import Boardgame.Board;
import Boardgame.Position;
import Chess.pieces.King;
import Chess.pieces.Rook;

public class ChessMath {

	private Board board;
	
	public ChessMath() {
		board = new Board(8, 8);
		initialSetup();
		
		
	}
  
public ChessPiece[][] getPieces() {
ChessPiece[][]mat = new ChessPiece[board.getRows()][board.getColumns()];
for (int i=0; i<board.getRows(); i++) {
	for (int j=0; j<board.getColumns(); j++) {
		mat[i][j] = (ChessPiece) board.piece(i,j);
		
	}
	
}

return mat;

}
 private void initialSetup() {
	 placeNewPiece('c', 1, new Rook(board, Color.WHITE));
     placeNewPiece('c', 2, new Rook(board, Color.WHITE));
     placeNewPiece('d', 2, new Rook(board, Color.WHITE));
     placeNewPiece('e', 2, new Rook(board, Color.WHITE));
     placeNewPiece('e', 1, new Rook(board, Color.WHITE));
     placeNewPiece('d', 1, new King(board, Color.WHITE));

     placeNewPiece('c', 7, new Rook(board, Color.BLACK));
     placeNewPiece('c', 8, new Rook(board, Color.BLACK));
     placeNewPiece('d', 7, new Rook(board, Color.BLACK));
     placeNewPiece('e', 7, new Rook(board, Color.BLACK));
     placeNewPiece('e', 8, new Rook(board, Color.BLACK));
     placeNewPiece('d', 8, new King(board, Color.BLACK));
	}

private void placeNewPiece(char c, int i, Rook rook) {
	// TODO Auto-generated method stub
	
}

private void placeNewPiece(char c, int i, King king) {
	// TODO Auto-generated method stub
	
}
 
 }



