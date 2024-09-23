package com.evergent.corejava.CollectionFramework;
import java.util.*;
public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("hello");
		al.add(45.8);
		al.add(100);
		System.out.println(al);
     Iterator it=al.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
     System.out.println("Element at index at 2   "+al.get(2));
	}

}
