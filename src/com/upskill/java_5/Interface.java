package com.upskill.java_5;

public interface Interface {
	
	//Interface can have only abstract methods, java 8 and forward they have static method too
	//Abstract method doesn't have any implementation
	//Encapsulation Hide the data
	//Abstraction hide the Implementation of methods
	//abstract method
	
	public abstract void iDoor(); //interface only abstract method

	public abstract int iWheel();
	
	public abstract void iSeat();
	
	public abstract String iColor();

	
/*
    (Parent)				   (Keyword) 				(Child)					 (Keyword) 					(GrandChild)
    						
	Class (0)				    extends					 Class (0)		 
	Abstract Class (4)			extends					 Class (4-4=0)
	Interface (4) 			  	implements				 Class (4-4=0)
	Interface (4) 				extends 				Interface (4+4=8)    	 implements					Class (8-8=0)
	Interface (4) 		  		implements				Abstract Class (4-4=0)
	Abstract Class (4) 		 	extends					Interface (4+4=8)        implements					Class (8-8=0)	
*/
	
}
