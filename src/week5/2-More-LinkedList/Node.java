package week5;

public class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node(){
		this.data = null;
		next = null;
	}
	public Node(T data){
		this.data = data;
		next = null;
	}
}
