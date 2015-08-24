package week7;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue<T> {
    private Queue<T> newQueue = new LinkedList<T>();

    public T pop() {
        return newQueue.poll();
    }

    public T peek() {
        return newQueue.peek();
    }

    public boolean isEmpty() {
        return newQueue.size() == 0;
    }
    

    public void push(T data) {
        Queue<T> temp = new LinkedList<>();
        temp.add(data);
        while (!isEmpty()){
            temp.add(newQueue.poll());
        }
        newQueue = temp;
    }

    public String toString(){
        return newQueue.toString();
    }
}
