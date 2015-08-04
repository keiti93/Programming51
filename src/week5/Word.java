package week5;

import java.util.Scanner;

public class Word {

	
	public static String LeftToRight (char [][] map, int n, int m){
		String result = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result += map[i][j];
				if (j == m-1){
					result += " ";
				}
			}
		}
		return result;
	}

	public static String RightToLeft (char [][] map, int n, int m){
		String result = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result = map[i][j] + result;
				if (j == m-1 && i != n-1){
					result  = " " + result;
				}
			}
		}
		return result;
	}
	
	public static String TopToBottom (char [][] map, int n, int m){
		String result = "";
		for (int j = 0; j <m; j++) {
			for (int i = 0; i < n; i++) {
				result += map[i][j];
				if (i == n-1){
					result  += " ";
				}
			}
		}
		return result;} 
	public static String BottomToTop (char [][] map, int n, int m){
		String result = "";
		for (int j = 0; j <m; j++) {
			for (int i = 0; i < n; i++) {
				result = map[i][j] + result;
				if (i == n-1 && j != m-1){
					result  = " " + result;
				}
			}
		}
		return result;
	}
	
public static String DiagonalToRight(char[][] map, int n, int m){
	  String result = "";
	for (int i = n - 1; i >= 0; i--) {
	       for (int j = 0, x = i; x <= n- 1; j++, x++) {
	    	  
	          result = result + map[x][j];
	          if (x == n-1){
	        	  result += " ";
	          }
	       }}
	for (int i = 1; i <= m; i++){
		for (int j = 0, y = i; j < n && j <= m; j++, y++){
			if (y==m-1 && j == n-1){
				i = m+1;
				break;}
			
			System.out.println(j + "," + y);
			result += map[j][y];
			if (j == n-1){
				result += " ";
			}
			
			System.out.println(result);
		}
	}
	result += map[n-1][m-1] + " ";
	System.out.println(result);
	
	for (int i = m-n+1; i <= m; i++) {
		System.out.println("wtf");
	       for (int j =0, x = i; x <= n- 1 && j==0; j--, x--) {
	    	   System.out.println("why");
	          result = result + map[j][x];
	          System.out.println(j + "," + x);
	          if (x == n-1){
	        	  result += " ";
	          }
	       }}
	       return result;}

public static String DiagonalToLeft(char[][] map, int n, int m){
	  String result = "";
	for (int i = n - 1; i >= 0; i--) {
	       for (int j = m-1, x = i; x <= n- 1; j--, x++) {
	          result = result + map[x][j];
	          if (x == n-1){
	        	  result += " ";
	          }
	       }}
	for (int i = 0; i <= n - 1; i++){
		for (int j = 0, y = n-i-1; y >= 0; j++, y--){
			if (y==0 && j ==0){
				result += map[0][0];
				break;
			}
			result += map[j][y];
			if (y == 0){
				result += " ";
			}
		}
	}
	       return result;}
	
	public static int IsTheWordInTheString(String string, String word){
		int counter = 0;
		int k = 0;
		for (int i = 0; i < string.length(); i++) {
			//System.out.println("k -> " + word.charAt(k)+ "; i ->  " + string.charAt(i));
			if (word.charAt(k) == string.charAt(i)){
				k++;}
			else { k = 0;}
			if (k==word.length()){
				counter++;
				k = 0;}
			}
		return counter;
		}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searched = scanner.next();
        char [][] map;
        int n,m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        map = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = scanner.next().charAt(0);
            }
        }

String string = LeftToRight(map, n,m) + " " + RightToLeft(map,n,m) + " " + BottomToTop(map, n, m) + " " + TopToBottom(map, n, m) + " " + DiagonalToRight(map, n,m) + " " + DiagonalToLeft(map, n,m);
System.out.println(IsTheWordInTheString(string, searched));
    }
}