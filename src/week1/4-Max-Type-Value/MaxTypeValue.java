package week1;

import java.util.Scanner;

public class MaxTypeValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		
		while (true){
			n ++;
			if (n<0){
				System.out.println("Int's MIN value is: " + (n));
				System.out.println("Int's MAX value is: " + (n-1));
				break;
			}
		}
	}
}
