package com.tnsif.collection.day_2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<Integer> arrayDeque = new ArrayDeque<Integer>();
		arrayDeque.add(12);
		arrayDeque.add(20);
		arrayDeque.add(31);
		arrayDeque.offer(17);
		arrayDeque.offerFirst(8);
		arrayDeque.offerLast(40);
		arrayDeque.add(51);
		System.out.println("DEQUE Elements: "+ arrayDeque);

		Iterator<Integer> itr = arrayDeque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After Poll, Poll Item is:" + arrayDeque.poll());

		for (Integer item : arrayDeque) {
			System.out.println(item);
		}
	}
}