package com.tnsif.wrapperclass;

public class WrapperClassSample {

	public static void main(String[] args) {
		
		//primitive into object --> AutoBoxing
		
		int a = 25;
		
		Integer b = Integer.valueOf(a);
		
		System.out.println(b);
		
		//object into primitive --> UnBoxing
		
		int c= b;
		
		
		System.out.println(c);
		

	}

}
