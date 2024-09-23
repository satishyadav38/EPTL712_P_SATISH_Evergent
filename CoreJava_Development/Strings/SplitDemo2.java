package com.evergent.corejava.Strings;

public class SplitDemo2 {

	public static void main(String[] args) {
		String str="our national bird is peacock and it is now endangered";
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}

	}

}
