package week3;

public class Travel {
	public String country = "";
	public String city = "";
	public float vat;
	public float total = 0;
	public Employee[] arrayEmpl = new Employee[2];
	public float maxExp1;
	public float maxExp2;
	
	public Travel(String city, String country, float vat){
		this.country = country;
		this.city = city;
		this.vat = vat;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public String getCountry(){
		return this.country;
	}

	public float getVat(){
		return this.vat;
	}
	
public void addExpense(TravelExpense expense){
		total += expense.cost;
		if (maxExp1 < expense.cost && maxExp1>= maxExp2){
			maxExp1 = expense.cost;
			arrayEmpl[0] = expense.employee;
		} else if (maxExp2 < expense.cost && maxExp2 <= maxExp1){
			maxExp2 = expense.cost;
			arrayEmpl[1] = expense.employee;
		}
	}
public float totalNetCost(){
	return total;
}
	public float totalCost(){
		return total + ((total*vat)/100);
	}
	
	public Employee[] mostExpensesMadeBy(){
		return arrayEmpl;
	}

}
