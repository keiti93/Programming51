package week6;

public class Labirinth {
	private Player p;
	private boolean completed;
	private char[][] map = { { '#', '#', '#', '#', '#', '#', '#', '#' },
			{ '#', '.', '#', '.', '.', '.', '.', '#' },
			{ '#', '.', '.', '.', '#', '#', '#', '#' },
			{ '#', '.', '#', '.', '.', '#', '.', '#' },
			{ '#', '#', '#', '#', '.', '.', '.', '#' },
			{ '#', '.', '.', '.', '.', '#', '.', '#' },
			{ '#', '#', '#', '#', '#', '#', '!', '#' } };

	public Labirinth() {
		completed = false;
		p = new Player(1, 1);
		p.setSymbol('@');
		movePlayer(0,0);
	}
	
	public boolean movePerson(Movement direction) {
		Player dir = direction.move();
		return movePlayer(dir.getX(),dir.getY());
	}

	public boolean movePlayer(int x, int y) {
		if(    p.getY() + y >= 0 && p.getY() + y < map.length
				&& p.getX() + x >= 0 && p.getX() + x < map[0].length
				&& map[p.getY() + y][p.getX() + x] != '#'
				) {
			if(map[p.getY() + y][p.getX() + x] == '!') {
				completed = true;
			}
			map[p.getY()][p.getX()] = '.';
			p.setX(p.getX() + x);
			p.setY(p.getY() + y);
			map[p.getY()][p.getX()] = p.getSymbol();
			return true;
		}
		return false;
	}

	public void print() {
		System.out.println(this);
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				str += map[i][j] + " ";
			}
			str += '\n';
		}
		return str;
	}
	
	public boolean isCompleted() {
		return completed;
	}
}

