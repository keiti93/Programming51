package week4;

import java.util.Scanner;
import java.util.Vector;

public class Anagrams {

	public static boolean areAnagrams(String a, String b) {
		Vector<Character> aList = new Vector<>();
		Vector<Character> bList = new Vector<>();
		a.toLowerCase();
		b.toLowerCase();

		for (int i = 0; i < a.length(); i++) {
			aList.add(a.charAt(i));
		}
		for (int i = 0; i < b.length(); i++) {
			bList.add(b.charAt(i));
		}

		if (aList.size() != bList.size()) {
			return false;
		} else {
			for (int i = 0; i < aList.size(); i++) {
				if (!bList.contains(aList.get(i))) {
					return false;
				}

			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();
		String b = scanner.next();

		if (areAnagrams(a, b)) {
			System.out.println("ANAGRAMS");
		} else {
			System.out.println("NOT ANAGRAMS");
		}
	}
}