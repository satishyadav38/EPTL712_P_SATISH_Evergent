package com.evergent.corejava.CollectionFramework;
import java.util.*;
public class CF12_ArrayList_ForEachObject {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add(100);
		al.add("hello");
		al.add(45.8);
		al.add(100);
		System.out.println("Size of arrayList is   "+al.size());
     for(Object o:al)
     {
    	 System.out.println(o);
     }
	}

}
