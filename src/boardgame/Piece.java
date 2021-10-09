//Pacote correspondente a camada de Tabuleiro
package boardgame;

//Classe Pe�a
public class Piece {
	
	protected Position position; //Posi��o simples de matriz (protectd para n�o ser visivel na camada de xadrez)
	private Board board; //Tbauleiro
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Posi��o de uma pe�a recem criada nulo
	}

	// Somente gettrs para n�o permitir que meu tabuleiro seja alterado
	//"protected" somente classes dentro do mesmo pacote e subclasses poder�o acessar o tabuleiro de uma pe�a
	//� de uso interno da camada de tabuleiro por isso '''protected'''
	protected Board getBoard() {
		return board;
	}


	
	
}
