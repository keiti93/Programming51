package week6;

public class Player {
	private int x;
	private int y;
	private char symbol;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.setSymbol(symbol);
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
}

