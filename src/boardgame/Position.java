//Pacote correspondente a camada de Tabuleiro
package boardgame;

//Classe Posição
public class Position {
	
	private int row; //Linha
	private int column; //Coluna
	
	//Construtor com argumentos
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	//Getters e Setters
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	// para imprimir uma posição na tela.
	
	@Override  //Sobreposição (sobreescrevendo o metodo toString que é da classe object)
	public String toString() {
		return row + ", " + column; //Imprime a linha " , " e a coluna
		
	}
}
