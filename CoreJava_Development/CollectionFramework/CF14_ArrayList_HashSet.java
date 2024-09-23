package com.evergent.corejava.CollectionFramework;
import java.util.*;
public class CF14_ArrayList_HashSet {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("CoreJava");
		al.add("J2EE");
		al.add("J2SE");
		al.add("myJava");
		System.out.println("ArratList:  "+al);
		Set<String>hs=new HashSet<String>();
		hs.addAll(al);
		System.out.println("HashSet:  "+hs);
		Set<String>hs2=new HashSet<String>();
		hs2.add("CoreJava");
		hs2.add("J2EE");
		hs2.add("J2SE");
		hs2.add("myJava");
		hs2.add("CoreJava");
		//hs2.add("Hello");
		if(hs.equals(hs2))
			System.out.println("Same");
		else
			System.out.println("Not Same");
		System.out.println(hs.containsAll(hs2));
	}

}
