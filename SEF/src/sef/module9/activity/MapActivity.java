package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Map;


public class MapActivity {

//	static String temp = "My Testing" ;
	
		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map<String,String> map = new HashMap();
			map.put("1","Eduard");
			map.put("2","John");
//			print(temp);
//			print1(10);
//			print2(temp);
//			print3(temp);
			//2 - Call print method to print the map passed as its parameter.
			print_map(map);
		}

		static void print_map(Map<String,String> map){
			for(Map.Entry<String,String> entry : map.entrySet()){
				System.out.println(entry.getValue());
			}
		}

//		static void print(String test)
//		{
//			int temp = Integer.valueOf(test);
//
//			System.out.println(test.toUpperCase());
//
//		}
//		static void print1(int a)
//		{
//			//int a = 10;
//			for (int i = 0 ; i< a; i++) {
//
//
//
//
//			}
//
//		}
//		static void print2(String test)
//		{
//			int temp = Integer.valueOf(test);
//
//			System.out.println(test.toUpperCase());
//
//		}
//		static void print3(String test)
//		{
//			int temp = Integer.valueOf(test);
//
//			System.out.println(test.toUpperCase());
//
//		}
	}
