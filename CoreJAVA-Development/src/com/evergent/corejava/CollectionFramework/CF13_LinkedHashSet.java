package com.evergent.corejava.CollectionFramework;
import java.util.*;
public class CF13_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String>lhs=new LinkedHashSet<>();
		lhs.add("A");
		lhs.add("B");
		lhs.add("O");
		lhs.add("M");
		lhs.add("G");
		System.out.println("LinkedHashSet:  "+lhs);
		System.out.println("Iterating over LinkedHashSet");
		for(String s:lhs)
		{
			System.out.println("LinkedHashSet objects:  "+s);
		}
		System.out.println("LinkedHashSet contains'mango':  "+lhs.contains("M"));
		lhs.remove("B");
		System.out.println("After Removing Banana from LinkedHashSet:  "+lhs);
		System.out.println("LinkedHashSet Size:  "+lhs.size());
		lhs.clear();
		System.out.println("LinkedHashSet:  "+lhs);
	}

}
