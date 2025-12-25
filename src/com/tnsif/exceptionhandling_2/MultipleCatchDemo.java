package com.tnsif.exceptionhandling_2;

public class MultipleCatchDemo {

	    public static void main(String[] args) {
	    	System.out.println("MultipleCatch Program Started ");
	        System.out.println("-------------------------------------");

	        try {
	        	System.out.println("I am in Try Block");
	            String name = null;
	            System.out.println(name.length());   
	            
	            int[] numbers = {10, 20, 30};
	            System.out.println(numbers[5]);      
	        }
	        
	        catch (NullPointerException e) {
	            System.out.println("I am in Catch Block : " + e.getMessage());
	        }
	        
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("I am in Catch Block : " + e.getMessage());
	        }
	        System.out.println("-------------------------------------");
	        System.out.println("MultipleCatch Program Ended");
	    }
	}
