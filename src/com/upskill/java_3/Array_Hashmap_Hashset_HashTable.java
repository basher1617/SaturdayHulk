package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		int age = 25;                                        //Variable
		int[] ageHulk = new int[]{25, 30, 35, 38, 43, 38};   //Array
		
		//Array Index [0] [1] [2] [3] [4] [5]
		
		int a = ageHulk[0] + ageHulk[2];
		
		System.out.println("Two student's Age : " + a);
		
		System.out.println("Student Age : " + ageHulk[5]);
		System.out.println("Total Student : " + ageHulk.length);
		
		String[] nameHulk = new String[]{"Munna", "Rasel", "Sabbir", "Redwan", "Mamun"};
		
		System.out.println("Name of student : " + nameHulk[2]);
		System.out.println("Total Student : " + nameHulk.length);
		
		//Multi-Dimentional Array
		
		int [] [] ageHulk2D = {{25, 30, 35, 38, 43, 38},       //[0][0],[0][1],[0][2],[0][3],[0][4],[0][5]
				               {23, 32, 38, 27}};              //[1][0],[1][1],[1][2],[1][3]
		System.out.println("Student Age 2D : " + ageHulk2D[1] [3]);
		
		// Hashmap store multiple data using key-value pair, Implementation of Map Interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>(); // we put {new} because Object
		
		Student.put("Redwan", 27);
		Student.put("Shabbir", 25);
		Student.put("Mamun", 35);
		Student.put("Muazzem", 23);
		
		System.out.println("Hashmap Student Age : "+ Student.get("Mamun"));
		
		HashMap<String, String> Country = new HashMap<String, String>();
		
		Country.put("USA", "Washington D.C");
		Country.put("UK", "London");
		Country.put("Bangladesh", "Dhaka");
		Country.put("Spain", "Madrid");
		
		System.out.println("Hashmap Capital : "+ Country.get("Bangladesh"));
		
		//HashTable store multiple data using key-value pair, No duplicate, also is synchronized (Only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("Region : " + Region.get("BD"));
		
		//Hashset store unordered collection containing unique value, Implementation of set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("Audi");
		car.add("BMW");
		car.add("Tesla");
		System.out.println("Car: " + car);
	}

}
