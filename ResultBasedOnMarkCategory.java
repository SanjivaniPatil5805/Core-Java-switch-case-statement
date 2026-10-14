package com.practice.switchcase;

public class ResultBasedOnMarkCategory {

public static void main(String[] args) {
		
		int marksCategory = 3;
		
		switch(marksCategory) {
		
		case 1 :
			System.out.println("Distinction");
			break;
		case 2 :
			System.out.println("Pass");
			break;
		case 3 :
			System.out.println("Fail");
			break;
		default :
			System.out.println("Invalid Marks Category");
		
		}
		
	}
	
}
