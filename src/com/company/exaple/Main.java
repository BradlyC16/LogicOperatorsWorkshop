package com.company.exaple;

public class Main {

    public static void main(String[] args) {
	/*
	 Relational Operators
	 <  - less than
	 <= - Less than OR equal to
	 >  - greater than
	 >= - greater than OR equal to
	 == - equals
	 != - not equal to

	 Logical Operators
	 && - AND
	 || - OR
	 !  - NOT


	 */

		int a = 2;
		int b = 4;
		int x = 6;
		int y = 1;

		System.out.println("a = 2");
		System.out.println("b = 4");
		System.out.println("x = 6");
		System.out.println("y = 1");

//	AND Operator
		if (a == x && y + y == a) {
//		Will this method run?
			System.out.println("a == x && y + y ==a");
//		No, it will not run
		}
//	OR Operator
		if (a == x || y + y == a) {
//	    Will this method run?
			System.out.println("a == x || y + y == a");
//        Yes, This will run
		}
//		NOT Operator
		if (a != x || y + y == a){
//	    Will this method run?
			System.out.println("a != x || y + y == a");
//			Yes, this will run
		}
//    LESS than <
		if (a < b){
//	  Will this method run?
			System.out.println("a < b");
//		  Yes, this will run because of the value of a is lesser than b
		}
//	  GREATER than >
		if (a > 6){
//		Will this method run?
		System.out.println("a is greater than 6");
//		Yes, because the value of a is greater than the value of 6
		}
//	  LESS than OR equal to <=
	  if (a <= 2) {
		  System.out.println("This if statement runs!");
	  }
//	  Greater than OR equal to
		if(a >= 8){
			System.out.println("a >= ");
		}
	}
}
