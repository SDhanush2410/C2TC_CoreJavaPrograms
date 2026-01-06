package com.tnsif.collection.day_2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	 public static void main(String[] args)
	    {
	        Queue<Integer> q= new LinkedList<>();

	        for (int i = 10; i < 50; i+=5) {
	        	q.add(i);
	        }
	        System.out.println("Elements of Queue- "+ q);
	        System.out.println("removed element- "+ q.remove());
	        System.out.println("Queue After Removal- "+q);
	        q.add(60);
	        q.add(50);
	        System.out.println("head of Queue- " + q.peek());
	        System.out.println("Size of Queue- " + q.size());
	    }

}
