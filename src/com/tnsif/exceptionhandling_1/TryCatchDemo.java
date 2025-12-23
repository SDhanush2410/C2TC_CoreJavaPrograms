package com.tnsif.exceptionhandling_1;

public class TryCatchDemo {

	public static void main(String[] args) {

		System.out.println("Program Started");

		int[] numbers = {10, 20, 30,40,50};

		try {
			
			TryCatchExample.display(numbers, 1);
			System.out.println("----------------------");
			TryCatchExample.display(numbers, 7);
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("I am in catch block :"+ e.getMessage());
			System.out.println("----------------------");
			
		}
		
		TryCatchExample.display(numbers, 4);
		System.out.println("Program Ended");
	}
}