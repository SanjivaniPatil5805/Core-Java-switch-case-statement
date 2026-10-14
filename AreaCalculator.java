package com.practice.switchcase;

public class AreaCalculator {

	public static void main(String[] args) {
		
		int num = 3;
		
		switch(num){
			
			case 1 :
			   float r = 3.4f;
			   System.out.println("Area of Circle = "+(3.14*r*r));
			   break;
			case 2:
				float l = 3.3f, b = 2.4f;
				System.out.println("Area of Rectangle = "+(l*b));
				break;
			case 3:
				float h = 5.5f;
				System.out.println("Area of Square = "+(h*h));
				break;
			default:
				System.out.println("Invalid Input");
			   
			
		}
		
	}
	
}
