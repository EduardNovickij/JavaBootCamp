package sef.module9.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		Set<String> names = new TreeSet();
		names.add("Eduard");
		names.add("Ben");
		names.add("John");
		names.add("Abigail");
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		try{
			names.add("Eduard");
			names.add("Abigail");
		}
		catch(Exception a){
			System.out.println(a.getMessage());
		}
		
		//2 - Call print method to print the set passed as its parameter.
		print(names);
	}
	
	static void print(Set<String> set)
	{
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
		for(String name : set){
			System.out.println(name);
		}
	}
}
