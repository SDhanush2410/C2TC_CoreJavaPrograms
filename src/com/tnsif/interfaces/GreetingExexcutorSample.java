package com.tnsif.interfaces;

public class GreetingExexcutorSample {
	
	public static void main(String[] args) {
		
		//lambda expression
		
		GreetingSample gd = () -> {
			System.out.println("Hi All! Welcome to the Java Full Stack Course!!");
		};
		
		gd.greet();
	}

}
