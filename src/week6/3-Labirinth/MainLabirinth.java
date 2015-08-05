package week6;

import java.util.Scanner;

public class MainLabirinth {
	public static void main(String[] args) {
		Labirinth l = new Labirinth();
		Scanner scanner = new Scanner(System.in);
		String direction;
		while (!l.isCompleted()) {
			System.out.println(l);
			System.out.println("Choose a direction to move: ");
			direction = scanner.next();

			switch (direction) {
			case "u":
				l.movePerson(new MoveUp());
				break;
			case "d":
				l.movePerson(new MoveDown());
				break;
			case "l":
				l.movePerson(new MoveLeft());
				break;
			case "r":
				l.movePerson(new MoveRight());
				break;
			}
		}
		System.out.println(l);
		System.out.println("Congratulations! You escaped the labirinth");
	}
}
