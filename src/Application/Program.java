package Application;

import java.util.Scanner;

import Chess.ChessMath;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
 ChessMath chessMatch = new ChessMath();

 while (true) {
	 
 UI.printBoard(chessMatch.getPieces());

 System.out.println();
 System.out.print("Source: ");
 Scanner sc = null;
ChessPosition source = UI.readChessPosition(sc);
 
 
 System.out.println();
 System.out.print("Target:  ");
 ChessPosition target = UI.readChessPosition(sc);
 

ChessPiece capturedPiece = chessMatch.performChessMove(source, target, target);
 
	}

}

}