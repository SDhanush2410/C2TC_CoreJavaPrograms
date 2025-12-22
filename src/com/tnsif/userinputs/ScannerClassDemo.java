package com.tnsif.userinputs;

import java.util.Scanner;

public class ScannerClassDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String name= sc.nextLine();
		
		
		System.out.println("Enter your Department: ");
		String dept= sc.nextLine();
		
		System.out.println("Enter your Reg.No: ");
		int regno= sc.nextInt();

		
		System.out.println("The Student Name  is :"+name);
		System.out.println("The Department of Student is :"+dept);
		System.out.println("The Register Number of Student is :"+regno);
		
		sc.close();
	}

}
