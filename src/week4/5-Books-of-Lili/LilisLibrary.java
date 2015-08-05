package week4;


import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class LilisLibrary {
	public static class Pair<F, S> {

		public F first;
		public S second;

		public String getPairString(){
			return (String) first;
		}
		
		public int getPairInt(){
			return (int) second;
		}
		
		public Pair(String string, Integer integer){
			first = (F) string;
			second =  (S) integer;
		}
	}

	public static Vector<Pair<String, Integer>> orderBooks(Vector<String> books) {

		Vector<Pair<String, Integer>> temp = new Vector<>();
		Vector<String> tempString = new Vector<>();
		Vector<Integer> tempInt = new Vector<>();
		int counter = 0;
		
		Collections.sort(books);

		for (int i = 0; i < books.size(); i++) {
			if (!tempString.contains(books.get(i))) {
				counter = 1;
				for (int j = i + 1; j < books.size(); j++) {
					if (books.get(i).equals(books.get(j))) {
						counter++;
					}
				}
				tempString.add(books.get(i));
				tempInt.add(counter);
			}

		}

		for (int i = 0; i < tempString.size(); i++) {
			Pair<String, Integer> e = new Pair(tempString.get(i),
					tempInt.get(i));
			temp.add(e);
		}
		return temp;
	} 

	public String toString(Vector<Pair<String, Integer>> temp) {
		String result = "";
		for (int i = 0; i < temp.size(); i++) {
			result += temp.get(i).getPairString() + ":"
					+ temp.get(i).getPairInt();
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    Vector<String> books = new Vector<String>();
	    int booksCount = Integer.parseInt(scanner.nextLine());

	    for (int i = 0; i < booksCount; i++) {
	      books.add(scanner.nextLine());
	    }

	    Vector<Pair<String, Integer>> result = orderBooks(books);

	    for(Pair<String, Integer> titleCount: result) {
	      System.out.println(titleCount.first + " : " + titleCount.second);
		}
	}
}
