package com.tnsif.interfaces;

interface Fruits{
	void sweet();//Declaration 
	void sour();
}

public class Interface_Sample implements Fruits {
	
	public void sweet() {//
		
		System.out.println("The fruits are very sweet in nature");
		
	}
	
	public void sour() {
		
		System.out.println("Some Fruits are Sour in nature");		
		
	}
	
	public static void main(String[] args) {
		
		Interface_Sample obj1 = new Interface_Sample();
		obj1.sweet();
		obj1.sour();
	}

}
