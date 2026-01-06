package com.tnsif.collection.day_2;

import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDemo {
	static void addElements(HashSet<Integer> numberHashSet) {
		numberHashSet.add(61);
		numberHashSet.add(41);
		numberHashSet.add(91);
		numberHashSet.add(51);
		numberHashSet.add(80);
		numberHashSet.add(11);
		numberHashSet.add(20);
	}

	public static void main(String[] args) {

		HashSet<Integer> Set1 = new HashSet<Integer>();
		addElements(Set1);

		HashSet<Integer> Set2 = new HashSet<Integer>();
		Set2.add(20);
		Set2.add(80);
		Set2.add(11);
		Set2.add(50);
		Set2.add(60);
		Set2.add(10);
		Set2.add(51);

		System.out.println("Set 1: " + Set1);
		System.out.println("Set 2: " + Set2);

		HashSet<Integer> Set3 = new HashSet<Integer>();
		addElements(Set3);
		Set3.addAll(Set2);//Union
		System.out.println("Union - Resultant Set : " + Set3);

		Set3.clear();
		addElements(Set3);
		Set3.retainAll(Set2);//Intersection
		System.out.println("Intersection - Resultant Set : " + Set3);

		Set3.clear();
		addElements(Set3);
		Set3.removeAll(Set2);//Set Differences
		System.out.println("Set Differences - Resultant Set : " + Set3);

		Spliterator<Integer> split=Set1.spliterator();
		split.forEachRemaining(System.out::println);
	}

}
