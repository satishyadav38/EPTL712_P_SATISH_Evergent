package com.evergent.corejava.CollectionFramework;
import java.util.*;
public class TreeSetDemo5 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(100);
		//ts.add("hello");
		//ts.add(45.8);
		ts.add(100);
		ts.add(45);
		ts.add(40);
		System.out.println(ts);
     Iterator it=ts.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
	}

}
