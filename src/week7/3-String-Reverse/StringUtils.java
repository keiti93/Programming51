package week7;

import java.util.Scanner;

public class StringUtils {
	public static String reverseStringWithStack(String s) {
		String str = "";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			st.push(s.charAt(i));
		}
		while(!st.empty()) {
			str += st.peek();
			st.pop();
		}
	    return str;
	  }
	
	
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
	System.out.println(reverseStringWithStack(str));
}

}
