package com.practice.switchcase;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		int number = 12;
		
		switch(number % 2) {
		
		case 0 :
			System.out.println(number +" is Even Number");
			break;
		default :
			System.out.println(number + " is Odd Number");
		
		}
		
	}
	
}
