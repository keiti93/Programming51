package week2;

public class Coffee {
	String brand = "";
	double price;
	

	public static void main(String[] args) {
	Coffee theBest = new Coffee();
	theBest.brand = "Afreddo";
	theBest.price = 1.29;
	
	Coffee good = new Coffee();
	good.brand = "Lavazza";
	good.price = 1.10;
	
	Coffee notSoGood = new Coffee();
	notSoGood.brand = "Don";
	notSoGood.price = 0.90;
	
	Coffee bad = new Coffee();
	bad.brand = "Blonde";
	bad.price = 0.80;
	
	Coffee theWorst = new Coffee();
	theWorst.brand = "Is that even coffee?!?";
	theWorst.price = 0.50;
	
	System.out.println(theBest);
	System.out.println(good);
	System.out.println(notSoGood);
	System.out.println(bad);
	System.out.println(theWorst);
	
	

	}

	public String toString(){
		return brand + ": "+ price;
	}


}
