package week2;

public class Food {
	public String name = "";
	public String type;
	public int weight;
	
	public Food(String name, String type, int weight){
		this.name = name;
		this.type = type;
		this.weight = weight;
	}
	
	public String toString(){
		return this.name + "- " + type + ": " + weight + "grams";
	}
}
