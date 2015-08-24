package week7;

import java.util.Vector;

public class PriorityQueue {
    private Vector<Integer> data;

    public PriorityQueue(){
        this.data = new Vector<>();
    }

    public void push(Integer el) {
        data.add(el);
    }

    public Integer pop(){
        int size = data.size();
        int index = 0;
        for(int i = 0; i < size; i++){
           if(data.get(i) > data.get(index)){
               index = i;
           }
        }
        int temp = data.get(index);
        data.remove(data.get(index));
        return temp;
    }

    public Integer peek(){
        return 0;
    }

    public boolean isEmpty(){
        return data == null;
    }

    
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.push(60);
        queue.push(75);
        queue.push(85);
        queue.push(50);
        queue.push(56);

        System.out.println(queue.pop()); // 85
        System.out.println(queue.pop()); // 75
        System.out.println(queue.pop()); // 60
    }
}
