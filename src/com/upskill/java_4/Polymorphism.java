package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType {
	
/* Polymorphism is the ability of an object to take on many forms.
   - Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
   - Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent Class to override
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism obj =  new Polymorphism();
		obj.AnnualIncomeVoid();
		
		car();
		car("Red");
		car("Blue", 4);
		car("Black", 4 , 5);

	}
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	public void AnnualIncomeVoid(){
		int rentalIncome = 25000;
		int crypto = 20000;
		int business = 25000;
		int CalculateAnnualIncome = hourlyIncome * 2000 + rentalIncome + crypto + business;
		System.out.println("My annual Income = " + CalculateAnnualIncome);
		
	}
	
	
	
	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("My car is Tesla");
	}
	
	public static void car(String color){
		System.out.println("My car is Tesla, color is " + color);
	}
	
	public static void car(String color, int door){
		System.out.println("My car is Tesla, color is " + color + ", it has " + door + " doors");
	}
	
	public static void car(String color, int door, int seat){
		System.out.println("My car is Tesla, color is " + color + ", it has door " + door + ", it has " + seat + " Seats");
	}

}
