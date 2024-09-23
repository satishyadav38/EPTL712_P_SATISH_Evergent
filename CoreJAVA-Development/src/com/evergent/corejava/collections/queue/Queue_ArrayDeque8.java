package com.evergent.corejava.collections.queue;
import java.util.*;
public class Queue_ArrayDeque8 {

	public static void main(String[] args) {
		ArrayDeque<String> pq=new ArrayDeque<>();
		pq.add("Banana");
		pq.addFirst("Pineapple");
		pq.offer("Watermelon");
	    pq.addLast("papaya");
	    pq.offerLast("kiwi");
	    pq.add("Apple");
	    pq.offerFirst("Mango");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peekLast());
		System.out.println(pq.peekFirst());
	}

}
