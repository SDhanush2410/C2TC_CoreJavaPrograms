package com.tnsif.userinputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Country name :");
		String country = br.readLine();
		
		System.out.println("Enter the Country Code");
		int code = Integer.parseInt(br.readLine());
		
		System.out.println("The country name is :"+ country + "\nthe Country code is :"+code);
	}

}