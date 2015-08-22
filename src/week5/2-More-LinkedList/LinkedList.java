package week5;

import java.util.Arrays;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	
	public LinkedList(){
		head = null;
		tail = null;
	}
	public void addFirst(T data){
		Node<T> temp = new Node<T>(data);
		if (head == null){
			head = temp;
			tail = head;
		}else{
		temp.next = head;
		head = temp;}
	}
	
	public void addLast(T data){
		Node<T> temp = new Node<T>(data);
		
		if (head == null){
			head = temp;

		}else{
		tail.next = temp;
	}		
		tail = temp;
		}
	
	public T getData(int index){
		return getElement(index).data;
	}
	
	public T getFirst(){
		return getElement(0).data;
	}
	
	public T getLast(){
		return tail.data;
	}
	
	public Node<T> getElement(int index){
		int counter = 0;
		Node<T> temp = head;
		while (temp != null){
			if(counter == index){
				break;
			}
			temp = temp.next;
			counter++;
		}
		return temp;
	}
	
	public boolean contains(T data){
		int counter = 0;
		Node<T> temp = new Node<T>(data);
		while (getElement(counter) != null){
			if(temp.data.equals(getElement(counter).data)){
				return true;
			}
			counter++;
		}
		return false;
	}
	
	public int getElementIndex(T data) {
		int counter = 0;
		Node<T> temp = new Node<T>(data);
		while (getElement(counter) != null){
			if(temp.data.equals(getElement(counter).data)){
				return counter;
			}
			counter++;
		}
		return -1;
	}
	
	public void insertAfter(int index, T data){
		Node<T> temp = new Node(data);
		Node<T> el = getElement(index);
		
		temp.next = el.next;
		el.next = temp;
		
	}
	
	public void remove(int index){
		if(index ==0){
			head = head.next;
		}else{
		Node<T> temp = getElement(index-1);
		if (temp==tail){
			tail = temp;
		}
		//temp.next = getElement(index+1);
		temp.next = temp.next.next;}
	}
	
	public String toString(){
		String str = "[";
		Node<T> temp = head;
		while(temp.next!= null){
			str += temp.data + ", ";
			temp = temp.next;
		}
		return str + temp.data + "]";
	}

	public void clear(){
		head = null;
	}

	public int size(){
		int counter = 0;
		Node<T> temp = head;
		while(temp != null){
		counter++;
		temp = temp.next;
		}
		return counter;
	}
	
public void set(int index, T data){
	Node<T> el = getElement(index);
	el.data = data;
	}
	
	public T[] toArray(T[] arr) {
		Node<T> temp = head;
		for (int i= 0; temp != null; i++) {
			arr[i] = temp.data;
			temp = temp.next;
	}
	return arr;
}

	public void addArray(T[] arr) {
		// Appends the array at the end of the list
		for (int i = 0; i < arr.length; i++) {
			addLast(arr[i]);
		}
	}

	private static <T> LinkedList<T> copy(LinkedList<T> l) {
    	LinkedList<T> newList = new LinkedList<T>();
    	if (l.head == null) {
    		return newList;
    	}
    	Node <T> temp = l.head;
    	while (temp.next != null) {
    		newList.addLast(temp.data);
    		temp = temp.next;
    	}
    	newList.addLast(temp.data);
    	return newList;	
    }

    public void insertListAfter(int index, LinkedList<T> l) {
        // Inserts all the elements of l after the index element
    	l = copy(l);
    	if (l.size() == 0) return;
    	if (size() - 1 == index) {
    		tail.next = l.head;
    		tail = l.tail;
    	} else {
    		Node <T> node = getElement(index); 
    		l.tail.next = node.next;
    		node.next = l.head;
    	}
    	int newsize = size();
    	newsize += l.size();
    }
    
    public void insertListBefore(int index, LinkedList<T> l){
        // Inserts all the elements of l before the index element
    	l = copy(l);
    	if (index == 0) {
    		l.tail.next = head;
    		head = l.head;
    		int newSize = size();
    		newSize += l.size();
    	} else {
    		insertListAfter(index - 1, l);
    	}
    }
}
