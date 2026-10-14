package com.practice.switchcase;

public class SignalColors {

	public static void main(String[] args) {

		String color = "green";

		switch (color) {

		case "red", " Red", "RED":
			System.out.println("Stop .!");
			break;
		case "yellow", "Yellow", "YELLOW":
			System.out.println("Ready .!");
			break;
		case "green", "Green", "GREEN":
			System.out.println("Go .!");
			break;
		default:
			System.out.println("Invalid Input");

		}

	}

}
