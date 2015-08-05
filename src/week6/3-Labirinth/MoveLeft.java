package week6;

public class MoveLeft implements Movement{

	public Player move() {
		return new Player(-1,0);
	}

}
