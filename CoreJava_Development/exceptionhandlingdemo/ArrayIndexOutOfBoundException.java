package com.evergent.corejava.exceptionhandlingdemo;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		int [] number= {1,2,3,4,5};
		try {
			System.out.println(number[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}

}
