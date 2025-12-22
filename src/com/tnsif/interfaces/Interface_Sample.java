package com.tnsif.interfaces;

interface Fruits{
	void sweet();//Declaration 
	void sour();
	void bitter();
}

public class Interface_Sample implements Fruits {
	
	public void sweet() {//
		
		System.out.println("The fruits like Mango,Jackfruit,etc.,  are very sweet in nature");
		
	}
	
	public void sour() {
		
		System.out.println("Some Fruits like Lemon, Orange are Sour in nature");		
		
	}
	
	public void bitter() {
		
		System.out.println("Grapefruits, Bitter Orange are bitterness in nature");		
		
	}
	
	public static void main(String[] args) {
		
		Interface_Sample obj1 = new Interface_Sample();
		obj1.sweet();
		obj1.sour();
	}

}
