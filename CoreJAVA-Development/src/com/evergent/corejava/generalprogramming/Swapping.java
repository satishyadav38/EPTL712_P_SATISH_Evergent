package com.evergent.corejava.generalprogramming;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enternumbers to be swapped");
		int a=sc.nextInt();
		int b=sc.nextInt();
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("numbers after swapped");
		 System.out.println(a+" "+b);
	}

}
