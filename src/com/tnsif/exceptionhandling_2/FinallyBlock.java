package com.tnsif.exceptionhandling_2;

public class FinallyBlock {

	public static void main(String[] args) {
    	System.out.println("Finally Block Program Started ");
        System.out.println("-------------------------------------");
        
		 try {
	         System.out.println("I am in Try Block");
			 String text = "JAVA";
	         System.out.println(text.charAt(10)); 
	     }
	     catch (StringIndexOutOfBoundsException e) {
	         System.out.println("I am in Catch Block: " + e.getMessage());
	     }
	     finally {
	         System.out.println("-------------------------------------");
	         System.out.println("Finally block executed");
	     } 
		
	}
}

