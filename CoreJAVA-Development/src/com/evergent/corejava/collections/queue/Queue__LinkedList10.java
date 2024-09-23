package com.evergent.corejava.collections.queue;
import java.util.*;
public class Queue__LinkedList10 {

	public static void main(String[] args) {
		Deque<String> pq=new LinkedList<>();
		pq.add("Ravi");
		pq.add("Bhanu");
		pq.offer("Shanker");
	    pq.add("Chandu");
		System.out.println(pq);
		
			System.out.println(pq.poll());
		
	}

}
