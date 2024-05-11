package com.upskill.java_1;

public class MethodType {

/* 	Types of Methods
	 
	1.Void Method
	2.Static Method
	3.Return Type Method  
 */
	
	public static int hourlyIncome = 65;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodType myobj = new MethodType();
		myobj.AnnualIncomeVoid();
		
		System.out.println("My monthly income = " + myobj.monthlyIncomeReturn());
		System.out.println("State is = " + myobj.Statereturn());
		
		weeklyIncomeStatic();
		staticReturn();

	}
	
	// void method
	public void AnnualIncomeVoid(){
		int CalculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My annual Income = " + CalculateAnnualIncome);
	}
	
    // return method
	public int monthlyIncomeReturn(){
		int CalculateMonthlyIncome = hourlyIncome * 180;
		return CalculateMonthlyIncome;
	}
	
	public String Statereturn(){
		// String State = "New York";
		return "New York";
	}
	
	//static method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome  = hourlyIncome * 40;
		System.out.println("My weekly Income = " + calculateWeeklyIncome);
	}
	
	public static boolean staticReturn(){
		boolean isSnow = false;
		System.out.println("It will snow : " + isSnow);
		return isSnow;
	}

}
