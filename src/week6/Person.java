package week6;

public class Person {
	private String id;
	private int age;
	private String name;


public String getId() {
	return id;
}


public int getAge() {
	return age;
}


public String getName() {
	return name;
}


public Person(String id, int age, String name) {

	this.id = id;
	this.age = age;
	this.name = name;
}

public void happyBirthday(){
	age += 1;

}


}
