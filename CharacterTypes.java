package com.practice.switchcase;

public class CharacterTypes {

	public static void main(String[] args) {

		char character = 'H';

		switch (character) {

		case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
				'v', 'w', 'x', 'y', 'z':
			System.out.println("Lowercase character");
			break;
		case 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
				'V', 'W', 'X', 'Y', 'Z':
			System.out.println("Uppercase character");
			break;
		case 1, 2, 3, 4, 5, 6, 7, 8, 9, 0:
			System.out.println("Digit");
			break;
		default:
			System.out.println("Special Character");

		}

	}

}
