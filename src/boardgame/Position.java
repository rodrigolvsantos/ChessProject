package boardgame;

public class Position {
	/*This class represent board (tabuleiro) fo game.
	 * */
	private int row; //line
	private int column; //column
	
	public Position () { //Constructor mecthod
		
	}
	
	public Position(int row, int column) { //Constructor mecthod and fields
		
		this.row = row;
		this.column = column;
	}
	public int getRow() {  //Getters and Setters
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
	
	@Override
	public String toString() {       //To string to imprime borad in monitor
		return row + ", " + column;
	}
}
