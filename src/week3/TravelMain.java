package week3;

public class TravelMain {

	  public static void main(String[] args) {
	    Employee ivo = new Employee("Ivaylo");
	    Employee rado = new Employee("Rado");
	    Employee magi = new Employee ("Margarita");
	    
	    Travel conf = new Travel("Sofia", "Bulgaria", 20);

	    TravelExpense dinnerRado = new TravelExpense("Dinner", rado, 70);
	    TravelExpense dinnerIvo = new TravelExpense("Dinner", ivo, 50);
	    TravelExpense dinnerMagi = new TravelExpense("Dinner", magi, 60);
	    conf.addExpense(dinnerRado);
	    conf.addExpense(dinnerIvo);
	    conf.addExpense(dinnerMagi);

	    System.out.println(conf.totalCost()); // 120

	    Employee[] toFire = conf.mostExpensesMadeBy();

	    for(Employee employee: toFire) {
	      System.out.println(employee);
	    
	    }
	  }

	
}
