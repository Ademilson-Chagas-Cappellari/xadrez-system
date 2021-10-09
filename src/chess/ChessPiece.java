package chess;

import boardgame.Board;
import boardgame.Piece;

//Subclasse da classe peça "extends"
public class ChessPiece extends Piece {
	
	private Color color;
	
	//Costrutor
	public ChessPiece(Board board, Color color) {
		super(board); //Repassa a chamada para o construtor da superclasse
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

		
}
