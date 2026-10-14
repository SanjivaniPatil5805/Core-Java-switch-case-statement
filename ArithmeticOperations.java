package com.practice.switchcase;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		int a = 19 , b = 4;
		char operator = '-';
		
		switch(operator) {
		
		case '+' :
			System.out.println(a + " + " + b + " = "+ (a+b));
			break;
		case '-' :
			System.out.println(a + " - " + b + " = "+ (a-b));
			break;
		case '*' :
			System.out.println(a + " * " + b + " = "+ (a*b));
			break;
		case '/' :
			System.out.println(a + " / " + b + " = "+ (a/b));
			break;
		default:
			System.out.println("Invalid operator");
			
		
		}
		
	}
	
}
