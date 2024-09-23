package com.evergent.corejava.collections.queue;
import java.util.*;
public class Queue_Demo4 {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		pq.add(8);
		pq.add(2);
		pq.offer(9);
	    pq.add(4);
	    pq.add(1);
		System.out.println(pq);
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}
	}

}
