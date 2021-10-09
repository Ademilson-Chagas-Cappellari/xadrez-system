//Pacote correspondente a camada de Tabuleiro
package boardgame;

//Classe Peça
public class Piece {
	
	protected Position position; //Posição simples de matriz (protectd para não ser visivel na camada de xadrez)
	private Board board; //Tbauleiro
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Posição de uma peça recem criada nulo
	}

	// Somente gettrs para não permitir que meu tabuleiro seja alterado
	//"protected" somente classes dentro do mesmo pacote e subclasses poderão acessar o tabuleiro de uma peça
	//É de uso interno da camada de tabuleiro por isso '''protected'''
	protected Board getBoard() {
		return board;
	}


	
	
}
