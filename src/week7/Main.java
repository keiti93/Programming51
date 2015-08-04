package week7;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Queue<Integer> q = new Queue<>();
		for (int i = 10; i < 20; i++) {
			s.push(i);		
			q.push(i);		
		}
		System.out.println(s);
		System.out.println(q);
	
	}
	
public static int get(int index, Queue<Integer> q){
	Queue<Integer> temp = q.copy();
	
	for (int i = 1; i < index; i++) {
		temp.pop();
	}
	return temp.peek();
}

}
