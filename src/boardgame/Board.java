package boardgame;

//Classe Tabuleiro
public class Board {
	
	private int rows; //Quantidade de linhas
	private int columns; //Quantidade de colunas
	private Piece[][] pieces; //Matriz de pe�as
	
	//Construtor com argumentos
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; //Matriz de pe�as instanciada na quantidade de linhas informadas e colunas tamb�m informadas
	}

	//Getters e Setters "columns e rows" somente
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//Metodo para retornar uma pe�a dada a uma linha e uma coluna
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	//Sobrecarga do metodo anterior para retornar a pe�a pela posi��o
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
		
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
		
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	// Para testar se h� uma pe�a nesta posi��o.
	public boolean thereIsAPiece(Position position) {
		return piece(position) != null;
	}
}
