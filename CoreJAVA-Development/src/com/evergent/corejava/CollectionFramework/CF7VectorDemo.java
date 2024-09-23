package com.evergent.corejava.CollectionFramework;
import java.util.*;
public class CF7VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Hello");
		v.add(100);
		v.add(45.4);
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
