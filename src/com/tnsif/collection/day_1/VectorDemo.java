package com.tnsif.collection.day_1;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> animals = new Vector<>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Elephant");

		System.out.println("Initial Vector: " + animals);
		String element = animals.get(2);
		System.out.println("Element at index 2: " + element);

		Iterator<String> iterate = animals.iterator();
		System.out.print("Vector: ");
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}

		System.out.println("\nRemoved Element: " + animals.remove(3));
		System.out.println("New Vector: " + animals);

		animals.clear();
		System.out.println("Vector after clear(): " + animals);
	}

}
