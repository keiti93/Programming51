package week2;

public class CoffeeMachine {
	public Coffee[] brandsOfCoffee = new Coffee[10];
	public int capacity = 10;
	public int count = 0;
	public double balance = 0;


public  boolean addCoffee(Coffee coffee)
{
	if (count<capacity){
		brandsOfCoffee[count] = coffee;
		count++;
		return true;	
		}
	return false;	
	}

public double buyCoffee(Coffee name, double price){
	for (int i = 0; i < count; i++){
		if (brandsOfCoffee[i].brand.equals(name.brand)){
			if (brandsOfCoffee[i].price <= price){
			double change = price - brandsOfCoffee[i].price;
			balance += name.price;
			System.out.println("Your change is: ");
			return change;}}
		
		}
	return -1;
	}

public String toString(){
	String str = "";
	for (int i = 0; i< count; i++){
		str += brandsOfCoffee[i].brand + "; ";
	}
	return "Brands of coffee: " + str; }

public static void main(String[] args) {
	
	CoffeeMachine cm = new CoffeeMachine();
	Coffee java = new Coffee();
	Coffee latte = new Coffee();

	java.brand = "Java";
	java.price = 1.00;

	latte.brand = "Latte";
	latte.price = 1.50;

	cm.addCoffee(java);
	cm.addCoffee(latte);

	System.out.println(cm);
	System.out.println(cm.buyCoffee(latte,(double) 3.40));
	System.out.println("Current balance: " + cm.balance);

}

}