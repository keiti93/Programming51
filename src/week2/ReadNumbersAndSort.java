package week2;

import java.util.Arrays;
import java.util.Scanner;


public class ReadNumbersAndSort {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number, please:");
    int n = scanner.nextInt();
    
    
    int[] numbers = new int[n];
    
    System.out.println();
    System.out.println("Now enter " + n + " more numbers, please:");
    for(int i = 0; i < n; i++) {
      int next = scanner.nextInt();
      numbers[i] = next;
    }
    
    Arrays.sort(numbers);
    
    System.out.println();
    System.out.println("The sorted numbers are:");
    for(int number: numbers) {
      System.out.println(number);
    }
    
  }
}