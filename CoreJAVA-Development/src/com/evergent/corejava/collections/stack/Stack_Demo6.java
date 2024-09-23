package com.evergent.corejava.collections.stack;
import java.util.*;
public class Stack_Demo6 {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push("RED");
		st.push("BLACK");
		st.push("WHITE");
		System.out.println(st);
		System.out.println("Enumeration Iteration");
		Enumeration e=st.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("Using Iterator");
		Iterator it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Using For each Adv loop");
		for(Object s:st)
		{
			System.out.println(s);
		}

	}

}
