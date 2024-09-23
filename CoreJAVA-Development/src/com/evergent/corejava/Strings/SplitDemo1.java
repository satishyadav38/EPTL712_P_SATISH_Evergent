package com.evergent.corejava.Strings;

public class SplitDemo1 {

	public static void main(String[] args) {
		String str="our national bird is peacock and it is now endangered";
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println();
		for(String word:s)
		{
			System.out.println(word);
		}

	}

}
