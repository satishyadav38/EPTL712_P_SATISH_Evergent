package com.evergent.corejava.collections.queue;
import java.util.*;
public class Queue_Demo3 {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		pq.add(8);
		pq.add(2);
		pq.offer(9);
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.clear();
		System.out.println(pq.remove());
		
	}

}
