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
//	OR Operator
	if(a == x || y + y == a){
//	    Will this method run?
        System.out.println("a == x || y + y == a");
//        Yes, This will run
    }
//		NOT Operator
		if(a != x || y + y == a){
//	    Will this method run?
			System.out.println("a != x || y + y == a");
//			Yes, this will run

    }
}}
