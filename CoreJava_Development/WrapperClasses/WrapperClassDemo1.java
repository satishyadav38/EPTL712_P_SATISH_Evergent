package com.evergent.corejava.WrapperClasses;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		int a=10;
		Integer i1=new Integer(a);
		System.out.println(i1);
		int a1=i1.intValue();
		System.out.println(a1);

	}

}
