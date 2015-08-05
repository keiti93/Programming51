package week4;

import java.util.Scanner;
import java.util.Vector;

public class VectorOfVectors {
	public static Vector<Integer> sortAndUnique(Vector<Vector<Integer>> v) {
		Vector<Integer> result = new Vector<Integer>();
		for (int i = 0; i < v.size(); i++) {
			for (int j = 0; j < v.get(i).size(); j++) {
				if (!result.contains(v.get(i).get(j))) {
					result.add(v.get(i).get(j));
				}

			}

		}
		for (int i = 0; i < result.size(); i++) {
			for (int j = i; j < result.size(); j++) {
				if (result.get(j) < result.get(i)) {
					int temp = result.get(i);
					result.set(i, result.get(j));
					result.set(j, temp);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Vector<Vector<Integer>> vi = new Vector<Vector<Integer>>();

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			Vector<Integer> v = new Vector<Integer>();
			int num = scanner.nextInt();
			for (int k = 0; k < num; k++) {
				v.add(scanner.nextInt());
			}
			vi.add(v);
		}
		System.out.println(sortAndUnique(vi));
	}

}
