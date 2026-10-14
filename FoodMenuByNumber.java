package com.practice.switchcase;

public class FoodMenuByNumber {

	public static void main(String[] args) {

		int num = 3;

		switch (num) {

		case 1:
			System.out.println("Pizza");
			break;
		case 2:
			System.out.println("Burger");
			break;
		case 3:
			System.out.println("Sandwhich");
			break;
		case 4:
			System.out.println("Pasta");
			break;
		default:
			System.out.println("Invalid Number");

		}

	}

}
