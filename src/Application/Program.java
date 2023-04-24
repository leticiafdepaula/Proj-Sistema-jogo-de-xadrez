package Application;

import java.util.Scanner;

import Chess.ChessException;
import Chess.ChessMath;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	
	private static ChessPosition source;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMath chessMatch = new ChessMath();

		while (true) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMatch);

				System.out.println();
				System.out.print("Source: ");



				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
			UI.clearScreen();
			UI.printBoard(chessMatch.getPieces(), possibleMoves);	
				System.out.println();
				System.out.print("Target:  ");
				ChessPosition Target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, Target );

			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();

			}
		}

	}
}