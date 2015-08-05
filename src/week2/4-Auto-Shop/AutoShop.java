package week2;

public class AutoShop {
	public Auto[] autoArray = new Auto[10];
	public int capacity = 10;
	public int count = 0;

	public void addCar(Auto auto) {
		if (count < capacity) {
			autoArray[count] = auto;
			count++;
		}
	}

	public Auto getTopSpeed() {
		float topSpeed = 0;
		Auto car = autoArray[0];
		for (int i = 0; i < count; i++) {
			if (autoArray[i].maxSpeed > topSpeed) {
				topSpeed = autoArray[i].maxSpeed;
				car = autoArray[i];
			}
		}
		return car;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < count; i++) {
			str += ("Car " + (i + 1) + ": " + "Brand: " + autoArray[i].brand
					+ " " + autoArray[i].name + ", Max Speed: "
					+ autoArray[i].maxSpeed + ", Price: " + autoArray[i].price
					+ ", Owner: " + autoArray[i].owner)
					+ ";" + "\n";
		}
		return str;
	}

	public static void main(String[] args) {
		Person Ivan = new Person("Ivan", "Ivanov", 25);
		Auto audi = new Auto(Ivan, 200, "Audi", "Begachka", 5000);

		Person Gosho = new Person("Gosho", "Goshev", 19);
		Auto peugeot = new Auto(Gosho, 220, "Peugeot", "Dragster", 125000);

		AutoShop as = new AutoShop();
		as.addCar(audi);
		as.addCar(peugeot);

		System.out.println(as);
		System.out.println("The fastest car in the shop is: "
				+ as.getTopSpeed());
	}

}
