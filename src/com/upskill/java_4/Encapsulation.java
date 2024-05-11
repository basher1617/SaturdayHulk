package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";               //Write and Read
	private int ssn = 45687123;                   // Write only
	private String username = "AshrafulBasher";  // read only
	
	//Setter Method - Name                      // set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name                      //get the data, Read
	public String getName(){
		return name;
	}
	
	//Setter method - ssn                      // set the data, Write
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method - name                     //get the data, Read
	public String getUserName(){
		return username;
	}
	
	public static void main(String[] args) {
		Encapsulation myObj = new Encapsulation();
		myObj.setName ("Muazzem601");
		System.out.println(myObj.getName());
		//System.out.println(myObj.setSSN());
		myObj.setSSN(101010101);
		System.out.println(myObj.getUserName());

	}

}
