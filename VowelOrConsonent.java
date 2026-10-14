package com.practice.switchcase;

public class VowelOrConsonent {

	public static void main(String[] args) {

		char character = 'E';

		switch (character) {

		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
			System.out.println(character + " is Vowel");
			break;
		default:
			System.out.println(character + " is consonent");

		}

	}

}
