package sef.module6.activity;

/* Person_I class is the superclass 
 * Attributes : name, age
 */
public class Person_I {

	//Attributes
	private String name;
	private int age;

	//Behavior - write default constructor. Print 'I'm Person_I constructor'
	public Person_I(){
		System.out.println("I'm Person_I constructor");
	}
	
	//Behavior - write parameterized constructor
	public Person_I(String n, int a){
		name = n;
		age = a;
	}
	
	// write getter for String name
	public String getName(){
		return name;
	}
	
	// write setter for String name
	public void setName(String n){
		name = n;
	}

	// write getter for int age
	public int getAge(){
		return age;
	}

	// write setter for int age
	public void setAge(int a){
		age = a;
	}
}

