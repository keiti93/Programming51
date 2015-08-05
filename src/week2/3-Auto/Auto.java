package week2;

public class Auto {
	Person owner;
	float maxSpeed;
	String brand;
	String name;
	double price;

public Auto (Person owner, float maxSpeed, String brand, String name, double price){
		this.owner = owner;
		this.maxSpeed = maxSpeed;
		this.brand = brand;
		this.name = name;
		this.price = price;}
public Auto (){};

	public static void main(String[] args) {
		Person Ivan = new Person("Ivan", "Ivanov", 25);
		Auto audi = new Auto(Ivan, 200, "Audi", "Begachka", 5000);

		Person Gosho = new Person("Gosho", "Goshev", 19);
		Auto benz = new Auto(Gosho, 300, "Mercedesss", "Benz", 125000);

		System.out.println(benz);
	}

public String toString(){
	return brand + " " + name +", Max Speed: "+ maxSpeed + ", Price: "+
 price + ", Owner: " + owner;
	}
}
