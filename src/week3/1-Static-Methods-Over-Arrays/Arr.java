package week3;

public class Arr {

	public static String toString(int[] a) {
		String array = "";
		for (int i = 0; i<a.length -1;i++){
			array += a[i] + ", ";
		}
		array += a[a.length-1];
		return array;

	}

	public static void sort(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[j] < a[i]){
					//swap
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}}}}
	
	public static int[] reverse(int[] a){
		int [] temp = new int[a.length];
		int index = a.length -1;
		for (int i = 0; i <a.length; i++){
			temp[i] = a[index];
			index--;
		}

	return temp;	
	}
	
	public static String join(int[] a, String glue){
		String glued = "";
		for (int i = 0; i< a.length-1; i++){
			glued += a[i] + glue;
		}
		glued += a[a.length-1];
		return glued;
	}
	
	public static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i<a.length;i++){
			sum+= a[i];
		}
		
		return sum;
	}
	
	public static int[] range(int a, int b){
		int [] temp = new int[Math.abs(b-a)];
		int index = 0;
		for (int i = a; i <= b-1; i++){
			temp[index] = i;
			index++;
		}
		return temp;
	}
	
	public static int[] filterOdd(int[] a){
		int counter = 0;
		for (int i = 0; i < a.length; i++){
			if (a[i]%2==1 || a[i]%2==-1){
				counter++;
			}}

		int index = 0;
		int [] odds = new int[counter];
		for (int i = 0; i < a.length; i++){
			if (a[i]%2==1 || a[i]%2==-1){
				odds[index] = a[i];
				index++;
				
			}}
			return odds;
	}
	
	
	public static void main(String[] args) {
	    int[] a = {10, 20, -50, 80, 70, 66, -365};

	    System.out.println("Print the array to string:");
	    System.out.println(Arr.toString(a));
	    
	    System.out.println("Sort the array a itself and print it sorted:");
	    Arr.sort(a);
	    System.out.println(Arr.toString(a));
	    
	    
	    System.out.println("Print the reverse of the sorted array");
	    System.out.println(Arr.toString(Arr.reverse(a)));
	    
	    System.out.println("Output each element in a with -> between them");
	    System.out.println(Arr.join(a, "->"));
	    
	    System.out.println("Output the sum");
	    System.out.println(Arr.sum(a));
	    
	    System.out.println("Output array with elements from 1 to 10");
	    System.out.println(Arr.toString(Arr.range(1, 10)));
	    
	    System.out.println("Print only the odd numbers");
		int [] temp = Arr.filterOdd(a);
	    System.out.println(Arr.join(temp, ", "));
	
	  }
}
