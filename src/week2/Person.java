package week2;

public class Person {
	String firstName = "";
	String lastName = "";
	int age;

	public Person (String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public Person(){};

public String toString(){
	return firstName + " " + lastName + " (" + age + ")";}}