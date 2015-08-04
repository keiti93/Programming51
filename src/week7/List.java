package week7;

public interface List<T> {
	public void push(T data);
	public T pop();
	public int size();
	public T peek();
	public boolean empty();
}
