package com.evergent.corejava.collections.queue;
import java.util.*;
public class Queue_ArrayDeque6 {

	public static void main(String[] args) {
		ArrayDeque<String> pq=new ArrayDeque<>();
		pq.add("Ravi");
		pq.add("Bhanu");
		pq.offer("Shanker");
	    pq.add("Chandu");
		System.out.println(pq);
		
			System.out.println(pq.poll());
		
	}

}
