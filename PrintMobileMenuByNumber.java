package com.practice.switchcase;

public class PrintMobileMenuByNumber {

	public static void main(String[] args) {
		
		int num = 3;
		
		switch(num) {
		
		case 1 :
			System.out.println("WiFi");
			break;
		case 2 :
			System.out.println("Bluetooth");
			break;
		case 3 :
			System.out.println("Mobile Data");
			break;
		case 4 :
			System.out.println("Airplane Mode");
			break;
		default :
			System.out.println("Invalid Number");
		
		}
		
	}
	
}
