package week3;

public class TravelExpense {
	public String type;
	public Employee employee;
	public float cost;
	
	public TravelExpense(String type, Employee employee, float cost){
		this.type = type;
		this.employee = employee;
		this.cost = cost;
	}
	
	public String getType(){
		return type;
		
	}
	public Employee getEmployee(){
		return employee;
		
	}
	public float getNetCost(){
		return cost;
		
	}
	
	
	

}
