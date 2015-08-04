package week7;

public class Queue<T> implements List<T>{
	public Node<T> head;
	public Node<T> tail;
	
	public Queue(){
		head = null;
		tail = null;
	}

	public void push(T data) {
		if (empty()){
			head = new Node<T>(data);
			tail = head;
		}else{
		tail.next = new Node<>(data);
		tail = tail.next;
	}}

	public T pop() {
		T el = head.data;
		head = head.next;
		return el;
	}

	public int size() {
		int counter = 0;
		Node<T> temp = head;
		while (temp != null){
			counter++;
			temp = temp.next;
		}
		return counter;
	}

	public T peek() {
		if(empty()) return null;
		return head.data;
	}


	public boolean empty() {
		return head == null;
	}
	
	public String toString(){
		if(empty()) return "[]";
		String str = "[";
		Node<T> temp = head;
		while(temp.next != null){
			str += temp.data + ", ";
			temp = temp.next;
		}
		return str + temp.data + "]";
		
	}
	
	public Queue<T> copy(){
		Queue<T> q = new Queue<>();
		Node<T> temp = head;
		while (temp!= null){
			q.push(temp.data);
			temp = temp.next;
		}
		return q;
	}

}
