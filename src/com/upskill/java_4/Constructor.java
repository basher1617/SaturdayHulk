package com.upskill.java_4;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	String studentName;
	int studentAge;
	
	// in constructor class name and Method name must be same
	//constructor cannot be static or override or void or return type

	public Constructor(String name){
		studentName = name;		
	}
	
	public Constructor(int age){	
		studentAge = age;	
	}
	
	public Constructor(String name, int age){
		studentName = name;
		studentAge = age;
	}

	public static void main(String[] args) {
		
		Constructor Obj = new Constructor("Redwan");
		System.out.println(Obj.studentName);
		
		Constructor Obj2 = new Constructor(29);
		System.out.println(Obj2.studentAge);
		
		Constructor Obj3 = new Constructor("Mamun",34);
		System.out.println(Obj3.studentName);
		System.out.println(Obj3.studentAge);

	}

}
