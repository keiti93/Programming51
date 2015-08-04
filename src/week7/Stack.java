package week7;

import java.util.LinkedList;

public class Stack<T> implements List<T>{

	private LinkedList<T> l;
	public Stack(){
		l = new LinkedList<T>();
	}
	
	public void push(T data) {
		l.addFirst(data);}

	public T pop() {
		T el = l.peek();
		l.removeFirst();
		return el;
	}
	
	public int size() {
		return l.size();
	}

	public T peek() {
		return l.getFirst();
	}

	public boolean empty() {
		return l.isEmpty();
	}
	
	public String toString(){
		return l.toString();
	}
}
