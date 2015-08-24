package week7;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static boolean areCorrect(String brackets) {
        Stack<Character> data = new Stack<>();
        for(int i = 0; i < brackets.length(); i++){
            char br = brackets.charAt(i);
            if(br == '{' || br == '[' || br == '('){
                data.push(brackets.charAt(i));
            } else {
                char temp;
                switch (br){
                    case '}': temp = '{';
                        break;
                    case ']': temp = '[';
                        break;
                    case ')': temp = '(';
                        break;
                    default: temp = ' ';
                }
                if(temp != data.peek()){
                    return false;
                }
                data.pop();
            }
        }
        return true;
    }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		System.out.println(Brackets.areCorrect(a));

	}
}
