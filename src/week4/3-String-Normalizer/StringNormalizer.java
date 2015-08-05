package week4;

import java.util.Scanner;
import java.util.Vector;

public class StringNormalizer {

    public static String normalizeString(String str) {
        Vector<String> listOfStrings = new Vector<>();
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
        	if (str.charAt(i)== ' '){
        		if (temp.length() == 0){
        			temp = "";
        		}else if (temp.length() == 1){
        			temp.toUpperCase();
        			listOfStrings.add(temp);
        		}else{
        			temp = temp.substring(0, 1).toUpperCase() + 
        			temp.substring(1).toLowerCase();
        			listOfStrings.add(temp);
        		}
        		
        		temp = "";
        	}else{
        		temp += str.charAt(i);
        	}
		
		}
        String result = "";
		for (int j = 0; j < listOfStrings.size()-1; j++) {
			result += listOfStrings.elementAt(j) + " ";
		}
        return result + listOfStrings.elementAt(listOfStrings.size()-1);
        
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(normalizeString(s));
    }

}
