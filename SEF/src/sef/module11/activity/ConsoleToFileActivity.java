package sef.module11.activity;
//Needs to be completed
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsoleToFileActivity {

	public static void main(String[] args) {
		
		//1 - Create variables to store name, age and phone number
		String name;
		int age, phone;
		
		//2 - Create an object of Scanner class which can read from keyboard 
		Scanner obj =new Scanner(System.in);
		
		//3 - Print messages to read name, age and phone number and accept all 3 
		System.out.print("Enter name: ");
		name = obj.nextLine();
		System.out.print("\n");
		System.out.print("Enter age: ");
		age = obj.nextInt();
		System.out.print("\n");
		System.out.print("Enter phone: ");
		phone = obj.nextInt();

		//4 - Create an object of FileOutputStream
		FileOutputStream fout;
		try {
			//5 - Initialize FileOutputStream object which is associated with 
			// .\\src\\sef\\module11\\activity\\temp4.txt and also appends everytime it's opened for writing
			fout = new FileOutputStream("./src/sef/module11/activity/temp4.txt");
	
			//6 - Write the name, age and phone no to this file.
			//Make sure that this data is delimited(separated) by a colon (:)
			//and each record is written on a new line
			String line = name+':'+age+':'+phone+'\n';
			byte[] Bytes = line.getBytes();
			fout.write(Bytes);
			//7 - Close FileOutputStream object
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
System.out.println("Data is written on the file. Thank you.");
	}
}
