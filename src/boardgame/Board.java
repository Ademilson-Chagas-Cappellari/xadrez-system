package boardgame;

//Classe Tabuleiro
public class Board {
	
	private int rows; //Quantidade de linhas
	private int columns; //Quantidade de colunas
	private Piece[][] pieces; //Matriz de peças
	
	//Construtor com argumentos
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; //Matriz de peças instanciada na quantidade de linhas informadas e colunas também informadas
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
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
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
	public boolean positionExists(Position positon) {
		return positionExists(position.getRow(), position.getColumn());
	}
	// Para testar se há uma peça nesta posição.
	public boolean thereIsAPiece(Position position) {
		return piece(position) != null;
	}
}
