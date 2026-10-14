package com.practice.switchcase;

public class DepartmentNameByNumber {

public static void main(String[] args) {
		
		int departmentNumber = 1;
		
		switch(departmentNumber) {
		
		case 1 :
			System.out.println("Computer Science");
			break;
		case 2 :
			System.out.println("Mechanical");
			break;
		case 3 :
			System.out.println("Civil");
			break;
		case 4 :
			System.out.println("Electrical");
			break;
		default :
			System.out.println("Invalid Department Number");
		
		}
		
	}
	
}
