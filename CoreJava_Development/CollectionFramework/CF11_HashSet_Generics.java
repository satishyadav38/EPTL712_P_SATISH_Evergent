package com.evergent.corejava.CollectionFramework;
import java.util.*;
public class CF11_HashSet_Generics {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("hello");
		hs.add(45.8);
		hs.add(100);
		System.out.println(hs);
     Iterator it=hs.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
	}

}
