package com.evergent.corejava.CollectionFramework;
import java.util.*;
public class CF10_ArrayList_Generics {

	public static void main(String[] args) {
		ArrayList<Integer> hs=new ArrayList();
		hs.add(100);
		//al.add("hello");
		//al.add(45.8);
		hs.add(100);
		hs.add(90);
		System.out.println(hs);
     Iterator it=hs.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
     System.out.println("Does arraylist contains element 100  "+hs.contains(100));
	}

}
