package week3;

public class IntegerVectorStatic {

	public static String toString(IntegerVector v) {
		String result = "";
		for (int i = 0; i < v.size - 1; i++) {
			result += v.data[i] + ", ";
		}
		return result + v.data[v.size - 1];
	}

	public static void sort(IntegerVector v) {
		for (int i = 0; i < v.size; i++) {
			for (int j = i; j < v.size; j++) {
				if (v.data[j] < v.data[i]) {
					int temp = v.data[i];
					v.data[i] = v.data[j];
					v.data[j] = temp;
				}
			}
		}
	}

	public static IntegerVector reverse(IntegerVector v) {
		int left = 0;
		int right = v.size - 1;

		while (left < right) {
			int temp = v.data[left];
			v.data[left] = v.data[right];
			v.data[right] = temp;
			left++;
			right--;
		}
		return v;
	}

	public static String join(IntegerVector v, String glue) {
		String result = "";
		for (int i = 0; i < v.size - 1; i++) {
			result += v.data[i] + glue;
		}
		return result + v.data[v.size - 1];
	}

	public static int sum(IntegerVector v) {
		int sum = 0;
		for (int i = 0; i < v.size; i++) {
			sum += v.data[i];
		}
		return sum;
	}

	public static IntegerVector range(int a, int b) {
		IntegerVector temp = new IntegerVector();
		temp.size = Math.abs(b - a);
		temp.data = new int[temp.size];
		int index = 0;
		for (int i = a; i <= b - 1; i++) {
			temp.data[index] = i;
			index++;
		}

		return temp;
	}

	public static IntegerVector filterOdd(IntegerVector v) {
		IntegerVector temp = new IntegerVector();
		temp.size = v.size;
		for (int i = 0; i <= v.size - 1; i++) {
			if (v.data[i] % 2 == 0) {
				temp.size -= 1;
			}
		}

		temp.data = new int[temp.size];
		int index = 0;
		for (int i = 0; i <= v.size - 1; i++) {
			if (v.data[i] % 2 == 1) {
				temp.data[index] = v.data[i];
				index++;
			}
		}
		return temp;
	}

	public static void main(String[] args) {

		int[] a = { 14, 23, 54, 2, 4, 7, 3, 12 };
		IntegerVector v = new IntegerVector();
		v.addAll(a);

		
		System.out.println("The vector is: ");
		System.out.println(IntegerVectorStatic.toString(v));
		IntegerVectorStatic.sort(v);

		System.out.println("The sorted vector is: ");
		System.out.println(IntegerVectorStatic.toString(v));

		System.out.println("The reversed vector is:");
		IntegerVector temp1 = IntegerVectorStatic.reverse(v);
		System.out.println(IntegerVectorStatic.toString(temp1));

		System.out.println("The joined vector is:");
		System.out.println(IntegerVectorStatic.join(v, "->"));

		System.out.println("The sum of the vector is:");
		System.out.println(IntegerVectorStatic.sum(v));

		System.out.println("The odd numbers in the vector are: ");
		IntegerVector temp2 = IntegerVectorStatic.filterOdd(v);
		System.out.println(IntegerVectorStatic.toString(temp2));

		System.out.println("A new vector wih given ranges is:");
		IntegerVector w = new IntegerVector();
		w = IntegerVectorStatic.range(10, 20);
		System.out.println(IntegerVectorStatic.toString(w));

	}

}
