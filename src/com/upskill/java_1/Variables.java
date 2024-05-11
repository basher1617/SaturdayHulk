package com.upskill.java_1;

public class Variables {
	
	public String Country = "USA";
	public static String Region = "North America";
	
	
//	Variables in Java
	
//	Instance OR global variable - Variables declared in Class level, outside method
//	Local variable - variables declared in methods 
//	Static variable - variables belong to class and don't required creating object
//	Method parameter - variables used as method parameter

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ny("Nassu County");
		nj("Essex", 500000);
		ct("FairField");
		
		Variables myObj = new Variables();
		System.out.println(myObj.Country);
		System.out.println(Region);

	}
	
	public static void ny(String county){
		String city = "Queens";
		System.out.println(city);
		System.out.println(county);
	}
	public static void nj(String county, int population){
		String city = "Bloomfield";
		System.out.println(city);
		
		String myCounty = county;
		System.out.println(myCounty);
		System.out.println(population);
	}
	public static void ct(String county){
		String city = "Hartford";
		System.out.println(city);
		System.out.println(county);
	}

}
