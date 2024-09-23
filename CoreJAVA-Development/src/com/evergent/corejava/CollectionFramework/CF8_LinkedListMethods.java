package com.evergent.corejava.CollectionFramework;
import java.util.*;
public class CF8_LinkedListMethods {

	public static void main(String[] args) {
		LinkedList f=new LinkedList();
		f.add("Apple");
		f.add("Banana");
		f.add("Cherry");
		f.add("Date");
		System.out.println(f);
		f.addFirst("mango");
		System.out.println(f);
		f.addLast("orange");
		System.out.println(f.get(2));
		f.removeFirst();
		System.out.println(f);f.removeLast();
		System.out.println("contains 'banana'?"+f.contains("Banana"));
		f.remove("Banana");
		System.out.println(f);
		System.out.println("size  "+f.size());
		f.clear();
		System.out.println(f);
	}

}
