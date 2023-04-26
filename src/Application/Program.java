package Application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Boardgame.Piece;
import Chess.ChessException;
import Chess.ChessMath;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	private static ChessPosition source;

	public static void main(String[] args, Piece captured) {

		Scanner sc = new Scanner(System.in);
		ChessMath chessMatch = new ChessMath();
		List<ChessPiece> caputred = new ArrayList<>();

		while (!chessMatch.getCheckmate()) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMatch, captured);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				System.out.println();
				System.out.print("Target:  ");
				ChessPosition Target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, Target);

				if (capturedPiece != null) {
					captured.add(capturedPiece);
				}
			}

			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();

			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}
        UI.clearScreen();
        UI.printMatch(chessMatch, captured);

	}


}



