package com.tnsif.exceptionhandling_2;

public class NestedTryCatchDemo {

		public static void main(String[] args) {
	        System.out.println("Nested Try-Catch program Started!!");
	        System.out.println("-------------------------------------");

	        try {

	            try {
		            System.out.println("Inner try block");
	                String name = "Java-FullStack";
	                System.out.println(name.charAt(20));  
	            }
	            catch (StringIndexOutOfBoundsException e) {
	                System.out.println("Inner catch: " + e.getMessage());
	            }
		        System.out.println("-------------------------------------");
	            System.out.println("Outer try block");
	            String value = null;
	            System.out.println(value.length()); 
	        }
	        catch (NullPointerException e) {
	            System.out.println("Outer catch: " + e.getMessage());
	        }
	        System.out.println("-------------------------------------");
	        System.out.println("Nested Try-Catch program Ended!!");
	    }
	}