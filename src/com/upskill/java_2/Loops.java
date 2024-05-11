package com.upskill.java_2;

public class Loops {
	
/* 	
 	Type of Loops
  		1. For Loop
  		2. While Loop
  		3. Do While Loop
  		4. Infinite Loop
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		practiceForLoop();
//		practiceWhileloop();
//		practiceDoWhileloop();
//		practiceInfiniteloop();
		practiceNestedLoop();

	}
	
	public static void practiceForLoop (){                        // for loop - Do again and again upto upper limit
		int i;                                                    // initialize the variable
		for (i=1; i <= 10; i++){                                  // setting lower limit, upper limit, Increment or decrement
			System.out.println("For Loops Number = " + i);        // statement
		}
	}
	public static void practiceWhileloop (){                      //While Loop - Do again and again upto condition match
		int i = 1;                                                //Initialize the variable
		while(i <= 10){                                           //Setting Condition
			System.out.println("While Loops number = " + i);      //Statement
			i++;                                                  //Increment or decrement
		}
	}
	public static void practiceDoWhileloop (){                    //Do While Loop - Do action then match condition
		int i = 1;                                                //Initialize the variable
		do {
			System.out.println("Do While Loops number = " + i);   //Statement
			i++;                                                  //Increment or Decrement
		} while (i <= 10);                                        //Checking condition
	}
	public static void practiceInfiniteloop (){                   //Infinite Loop - never ending loop
		int i = 1;                                                //Initialize the variable
		for (i=1; ; i++){                                         //Setting No Upper limit
			System.out.println("Infinite Loops number = " + i);   //Statement
		}
	}
	public static void practiceNestedLoop(){                      //Nested Loop - loop inside another loop
		int i;                                                    //Initialize i for loop 1
		int j;                                                    //Initialize j for loop 2
		for (i=1; i<=10; i++){                                    //First loop for i
			for (j=1; j<=10; j++){                                //Second loop for j
				int multiplicationTable = i*j;                    //Statement for loop 2
				System.out.print(multiplicationTable + " ");
			}
			System.out.println(" ");
		}
	}

}
