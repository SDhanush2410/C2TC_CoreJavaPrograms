package com.tnsif.userinputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter First Subject Mark :");
		int mark1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Second Subject Mark :");
		int mark2 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Third Subject Mark :");
		int mark3 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Fourth Subject Mark :");
		int mark4 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Fifth Subject Mark :");
		int mark5 = Integer.parseInt(br.readLine());
		
		int avg=(mark1+mark2+mark3+mark4+mark5)/5 ;
		System.out.println("The Average of Five Subjects is :"+avg);
	}

}