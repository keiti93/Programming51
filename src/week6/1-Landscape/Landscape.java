package week6;

import java.util.ArrayList;

public class Landscape {
	ArrayList<Tile> tiles = new ArrayList<>();

	public void addTile(Tile T) {

		tiles.add(T);
	}

	public String renderAll() {
		String result = "";
		for (int i = 0; i < tiles.size(); i++) {
			result += tiles.get(i).render();

		}
		return result;
	}
}
