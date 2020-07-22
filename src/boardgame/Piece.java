package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//n�o precisava informar pois se n�o � informado o valor no construtor, o java seta null automaticamente na vari�vel
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
}
