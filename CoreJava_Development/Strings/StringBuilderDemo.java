package com.evergent.corejava.Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("HELLO");
		System.out.println("initial String "+sb);
		System.out.println(sb.append("evergentian"));
		System.out.println(sb.insert(5,"HAI"));
		System.out.println(sb.replace(0, 5,"Hey"));
		System.out.println(sb.delete(0,6));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
