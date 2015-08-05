package week7;

import java.util.Scanner;
import java.util.Stack;
public class Parser {

	public static int evaluate(String formula, int x) {
		Stack<Integer> formulas = new Stack<>();
		for (int i = 0; i < formula.length(); i++) {
			if (formula.charAt(i) == '1' || formula.charAt(i) == '2'
					|| formula.charAt(i) == '3' || formula.charAt(i) == '4') {
				formulas.push(Character.getNumericValue(formula.charAt(i)));
			}
		}

		while (formulas.size() != 0) {
			int f = formulas.peek();
			switch (f) {
			case 1:
				x = 2 * x + x + 1;
				break;
			case 2:
				x = 2 * x;
				break;
			case 3:
				x = x + 1;
				break;
			case 4:
				x = 2 * (2 * x + x + 1);
				break;
			default:
				x = 0;
				break;

			}
			formulas.pop();

		}
		return x;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		int x = scanner.nextInt();

		System.out.println(evaluate(input, x));

	}

}
