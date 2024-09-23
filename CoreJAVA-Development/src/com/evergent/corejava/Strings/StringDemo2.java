package com.evergent.corejava.Strings;
public class StringDemo2 {

	public static void main(String[] args) {
		String str1=new String("Hello");
		String str2=new String("Hello");
		String str3="JAVA";//memory allocation in string constant pool
		String str4="JAVA";//refernces to same memory allocation as above object in string constant pool
		if(str1==str2)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		if(str1.equals(str2))
		 System.out.println("TRUE");
		else
			System.out.println("FALSE");
		if(str3==str4)
			 System.out.println("TRUE");
			else
				System.out.println("FALSE");
		if(str3.equals(str4))
			 System.out.println("TRUE");
			else
				System.out.println("FALSE");
	}
}