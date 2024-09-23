package com.evergent.corejava.Strings;

public class StringDemo3 {

	public static void main(String[] args) {
		String str1=new String("   Hello World  ");//memory allocation with a new object in heap memor
			System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.trim());
	}

}
