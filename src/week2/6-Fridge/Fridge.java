package week2;

public class Fridge {
	public int capacity;
	public int counter = 0;
	public Food[] fridge;
	public int weight;
	
	public Fridge(){}
	
	public Fridge (int capacity, int weight){
		this.capacity = capacity;
		this.weight = weight;
		this.fridge = new Food[capacity];
	}
	
	public boolean addFood(Food f){
		if (counter < capacity){
			fridge[counter] = f;
			counter++;
			return true;
		} return false;
	}
	
	public int getFoodCount(){
		return counter;
	}
	
	public int getWeight(){
		int totalWeight = 0;
		for (Food food : fridge){
			if (food != null){
			totalWeight += food.weight;
		}}
		return totalWeight;
	}
	
	public int getMaxWeight(){
		return weight;
	}
	
	public int getCapacity(){
		return capacity;
	}
	
	public Food getHeaviestFood(){
		Food heaviest = fridge[0];
		for (Food food : fridge){
			if (food != null && food.weight > heaviest.weight){
				heaviest = food;
			}
			
		}
		return heaviest;
	}
	public String [] getProductsOfType(String type){
		String [] productsOfType = new String[capacity];
		int counter = 0;
		for (Food food: fridge){
			if (food != null && food.type == type){
				productsOfType[counter] = food.toString();
				counter++;
			}
		}
		String[] newArray = new String[counter];
		int counter2 = 0;
		for (int i = 0; i<productsOfType.length; i++){
			if(fridge[i] != null && fridge[i].type == type){
				newArray[counter2] = fridge[i].toString();
				counter2++;
			}
		}
		return newArray;
	}
	
	public String toString(){
		String result = "";
		for (Food food : fridge){
			if (food != null){
				result += food + "\n";
		}}
		return result;}
	
	public static void main(String[] args) {
		
		Fridge fridge = new Fridge(10, 5000);
	    fridge.addFood(new Food("Cheese", "Milk", 300));
	    fridge.addFood(new Food("Milk", "Milk", 1000));
	    fridge.addFood(new Food("Beer", "Bevarage", 500));

	    System.out.println(fridge);

	    System.out.println("Food count: "+ fridge.getFoodCount());

	    System.out.println("Foods of a certain type:");
	    String [] temp = fridge.getProductsOfType("Milk");
	    for(int i=0; i<temp.length; i++){
	        System.out.println(temp[i]);};
	        
	    System.out.println("Current weight: " + fridge.getWeight());
	    
	    System.out.println("Max weight of the fridge: " + fridge.getMaxWeight());
	    
	    System.out.println("The heaviest food in the fridge is: " + fridge.getHeaviestFood());
	    
	    System.out.println("The capacity of the fridge is: " + fridge.getCapacity());
	}

}
