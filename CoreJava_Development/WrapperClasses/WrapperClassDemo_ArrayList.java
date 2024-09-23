package com.evergent.corejava.WrapperClasses;
import java.util.*;
public class WrapperClassDemo_ArrayList {

	public static void main(String[] args) {
		int a=100;
		Integer t1=new Integer(a);
		ArrayList al=new ArrayList();
		al.add(t1);
		System.out.println(al);
		Integer i2=new Integer(200);
		System.out.println(al.add(100));
		System.out.println(al.add(new Integer (45)));
		System.out.println(al.get(1));

	}

}
