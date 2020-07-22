package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//não precisava informar pois se não é informado o valor no construtor, o java seta null automaticamente na variável
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
}
