package week1;

public class Classwork {


	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		String str = input.next();*/
		
		
		
		
		System.out.println(devider(5,2));
	}
public static String reverse(String name){
	
	String tempName = "";
	
	for (int i = 0; i< name.length(); i++){
		tempName = name.charAt(i) + tempName;
	}
	return tempName;
}


public static double devider(double a, double b){
	double c=a/b;
	return c;
}
}


