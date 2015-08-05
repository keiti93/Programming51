package week3;

public class IntegerVector {
	public int[] data;
	private int capacity;
	public int size;

	public IntegerVector() {
		capacity = 10;
		size = 0;
		data = new int[capacity];
	}

	public void add(int el) {
		if (size == capacity) {
			resize();
		}
		data[size] = el;
		size++;
	}

	private void resize() {
		capacity = capacity * 2 + 1;
		int[] temp = new int[capacity];
		for (int i = 0; i < size; i++) {
			temp[i] = data[i];
		}

		data = temp;
	}

	public int size() {
		return size;
	}

	public int sum() {
		int result = 0;
		for (int i = 0; i < size; i++) {
			result += data[i];
		}
		return result;
	}

	public void addAll(int[] n) {
		for (int i = 0; i < n.length; i++) {
			add(n[i]);
		}
	}

	public int get(int index) {
		return data[index];
	}

	public void set(int index, int el) {
		data[index] = el;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < size; i++) {
			result += data[i];
			if (i != size - 1) {
				result += ", ";
			}
		}
		return result;
	}

	public void insert(int index, int data1) {
		add(data1);
		for (int i = size - 1; i > index; i--) {
			int temp = data[i - 1];
			data[i - 1] = data[i];
			data[i] = temp;
		}
	}

	public void remove(int index) {
		for (int i = index; i < size; i++) {
			data[i] = data[i + 1];
		}
		size--;
	}
	
	public static void main(String[] args) {
		IntegerVector v = new IntegerVector();
	    for (int i = 0; i < 11; i++) {
	        v.add(i);
	    }
	    System.out.println("The vector is:");
	    System.out.println(v);
	    
	    System.out.println("The size of the vector is:");
	    System.out.println(v.size());
	    
	    System.out.println("The sum of the vector is:");
	    System.out.println(v.sum());
	    
	    System.out.println("The third integer in the vector is:");
	    System.out.println(v.get(2));
	    
	    v.insert(3, 99);
	    System.out.println("The vector with inserted number after index 3 is:");
	    System.out.println(v);
	    
	    v.remove(5);
	    System.out.println("The vector with removed element at index 5 is:");
	    System.out.println(v);
	    
	    int [] b = new int[6];
	    for (int i = 0; i < 6; i++) {
	        b[i] = i;
	    }
	    v.addAll(b);
	    
	    System.out.println("Two joined vectors:");
	    System.out.println(v);
	    
	    
	}
}
