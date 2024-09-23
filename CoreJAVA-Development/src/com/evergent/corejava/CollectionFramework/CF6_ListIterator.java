package com.evergent.corejava.CollectionFramework;
import java.util.*;
public class CF6_ListIterator {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("Satish");
		l.add("Akhil");
		l.add("Sandeep");
		l.add("Avula");
		ListIterator li=l.listIterator();
		li.add("Bhargav");
		while(li.hasNext())
		{
			String s=(String)li.next();
			System.out.println(s);
			if(s.equals("Satish"))
				li.remove();
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}

	}

}
