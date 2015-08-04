package week6;

public class MainPerson {
public static void main(String[] args){
	Person p = new Person ("123", 10, "Ivan");
	
	p.happyBirthday();
	
	System.out.println(p.getAge());
}
}
