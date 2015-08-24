package week7;

import java.util.Scanner;
import java.util.Stack;

public class PositivesAndNegatives {
    private int[] data;

    public PositivesAndNegatives(int[] data){
        this.data = data;
    }

    private void sort(){
        int index;
        for (int i = 0; i < data.length; i++){
            index = i;
            for (int n = i; n < data.length; n++){
                if(data[n] < data[index]){
                    index = n;
                }
            }
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
    }
    public Stack<Integer> reorder() {
        Stack<Integer> result = new Stack<>();
        sort();
        for(int number:data){
            if(number >= 0){
                result.push(number);
            }
        }
        for(int i = data.length - 1; i >= 0; i--){
            if(data[i] < 0 ){
                result.push(data[i]);
            }
        }
        return result;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        PositivesAndNegatives data = new PositivesAndNegatives(numbers);
        Stack<Integer> result = data.reorder();

        while(!result.isEmpty()) {
            System.out.println(result.pop());
        }
    }

}
