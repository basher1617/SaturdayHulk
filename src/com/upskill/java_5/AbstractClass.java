package com.upskill.java_5;

public abstract class AbstractClass {
	
	
	// abstract class has regular method and abstract method
	
	//regular method
	public void car(){
		System.out.println("My car is Tesla");
	}
	
	public void door(){
		System.out.println("My car has 4 doors");
	}
	
	//abstract method
	public abstract void iDoor();

	public abstract int iWheel();
	
	public abstract void iSeat();
	
	public abstract String iColor();
	


}
