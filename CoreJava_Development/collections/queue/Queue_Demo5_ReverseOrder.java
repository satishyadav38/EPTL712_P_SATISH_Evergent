package com.evergent.corejava.collections.queue;
import java.util.*;
public class Queue_Demo5_ReverseOrder {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(8);
		pq.add(2);
		pq.add(5);
		pq.offer(9);
	
		System.out.println(pq);
		
			System.out.println(pq.poll());
			System.out.println(pq);
	}

	
	}

