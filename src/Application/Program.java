package Application;

import java.util.Scanner;

import Chess.ChessException;
import Chess.ChessMath;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	private static Scanner sc;

	public static void main(String[] args) {

		ChessMath chessMatch = new ChessMath();

		while (true) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMatch);

				System.out.println();
				System.out.print("Source: ");
				Scanner sc = null;
				ChessPosition source = UI.readChessPosition(sc);

				System.out.println();
				System.out.print("Target:  ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target, target);

			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();

			}
		}

	}
}