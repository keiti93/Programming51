package week1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Binary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = input.nextInt();
		System.out.println("Enter a binary number:");
		String b = input.next();
		
		System.out.println("The number " + a + " in binary is " + toBinary(a));
		System.out.println("The binary number " + b + " is " + toNumber(b));
		System.out.println("The number "+ a + " is " + toBinary(a) + " in binary and contains " + countBits(a) + " bits.");
		System.out.println("The number " + a + " is a power of two: " + isPowerOfTwo(toBinary(a)));
	}
		
		public static String toBinary(int n){
		String binaryNumber = "";
		while (n != 0)
		{ 
		binaryNumber = (n%2) + binaryNumber ;
		n = n/2;}
	
		return binaryNumber;
		}

		public static int toNumber(String binary){
			char [] numbers = binary.toCharArray();
		    int result = 0;
		    for (int i=numbers.length-1; i>=0; i--) {
		       if (numbers[i]=='1') {
		          result = result + (int)Math.pow(2, numbers.length-i-1);
		        }
		    }
		    return result;
		}
		
		public static int countBits(int n){
			String binaryN = (toBinary(n));
			char [] numbers = binaryN.toCharArray();
			int result = 0;
			for (int i = 0; i < numbers.length; i++){
				if (numbers[i]=='1') {
					result = numbers.length-i;
					break;
				}
			
			}
			return result;
		} 
		
		public static boolean isPowerOfTwo(String binary){
			char [] numbers = binary.toCharArray();
			int count = 0;
			for (int i=0; i< numbers.length; i++){
				if (numbers[i] == '1'){
					count++;
				}}
			return count == 1;
				
			
		}
}
