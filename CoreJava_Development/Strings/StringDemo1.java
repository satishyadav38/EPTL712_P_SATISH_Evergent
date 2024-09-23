package com.evergent.corejava.Strings;

public class StringDemo1 {

	public static void main(String[] args) {
		String str1=new String("Hello");//memory allocation with a new object in heap memory
		String str2=new String("Hello");// creation of another object in heap memory
		if(str1==str2)             //compares memmory allocations
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		if(str1.equals(str2))        //compares all characters or content of strings
		 System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}

}
