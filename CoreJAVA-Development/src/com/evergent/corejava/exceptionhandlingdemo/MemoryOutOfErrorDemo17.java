package com.evergent.corejava.exceptionhandlingdemo;

public class MemoryOutOfErrorDemo17 {

	public static void main(String[] args) throws Exception{
		Integer a[]=new Integer[1000000000*1000000];
	
		a[0]=1;
		System.out.println(a);
	}

}
