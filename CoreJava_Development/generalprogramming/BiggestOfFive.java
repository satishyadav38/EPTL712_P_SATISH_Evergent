package com.evergent.corejava.generalprogramming;

import java.util.Scanner;

public class BiggestOfFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   int a=sc.nextInt();
		   int b=sc.nextInt();int c=sc.nextInt();
		   int d=sc.nextInt();int e=sc.nextInt();
		   if(a>b&&a>c&&a>d&&a>e)
		     System.out.println(a);
		   else if(b>c&&b>d&&b>e)
			   System.out.println(b);
		   else if(c>d&&c>e)
			   System.out.println(c);
		   else if(d>e)
			   System.out.println(d);
		   else
			   System.out.println(e);
			   
		   

	}

}
