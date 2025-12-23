package com.tnsif.nonaccessmodifiers;

public class FinalExample {
	
	int x = 100;
	
	void print() {
		System.out.println("Print the value of x: "+ x);
	}

	public static void main(String[] args) {
		
		FinalExample fe = new FinalExample();
		fe.print();
		
		fe.x = 200; 
		
		fe.print();
		
	}

}

class Example extends FinalExample{
	void print() {
		
	}
}
