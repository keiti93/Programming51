package week1;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int original_n = n;
		int rev = (n % 10);
		n = n / 10;
		while (n != 0) {
			rev = rev * 10 + (n % 10);
			n = n / 10;
		}
		int sum = original_n + rev;
		int rev_sum = (sum % 10);
		int sum1 = sum / 10;
		while (sum1 != 0) {
			rev_sum = rev_sum * 10 + (sum1 % 10);
			sum1 = sum1 / 10;
		}

		if (sum == rev_sum) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
