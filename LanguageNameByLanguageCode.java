package com.practice.switchcase;

public class LanguageNameByLanguageCode {

public static void main(String[] args) {
		
		int langCode = 3;
		
		switch(langCode) {
		
		case 1 :
			System.out.println("Java");
			break;
		case 2 :
			System.out.println("Python");
			break;
		case 3 :
			System.out.println("C#");
			break;
		case 4 :
			System.out.println("Javascript");
			break;
		default :
			System.out.println("Invalid Language Code");
		
		}
		
	}
	
}
