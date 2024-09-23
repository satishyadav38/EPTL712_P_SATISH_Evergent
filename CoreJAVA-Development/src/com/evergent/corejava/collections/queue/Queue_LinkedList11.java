package com.evergent.corejava.collections.queue;
import java.util.*;
public class Queue_LinkedList11 {

	public static void main(String[] args) {
		Deque<String> pq=new LinkedList<>();
		pq.add("Banana");
		pq.addFirst("Pineapple");
		pq.offer("Watermelon");
	    pq.addLast("papaya");
	    pq.offerLast("kiwi");
	    pq.add("Apple");
	    pq.offerFirst("Mango");
		System.out.println(pq);
		System.out.println(pq.isEmpty());
		System.out.println(pq.size());
		pq.clear();
		System.out.println(pq);
	}

}
