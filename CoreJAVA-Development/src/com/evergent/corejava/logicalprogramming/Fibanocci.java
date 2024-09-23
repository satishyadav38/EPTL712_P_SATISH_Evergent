package com.evergent.corejava.logicalprogramming;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1;
		for(int i=0;i<5;i++)
		{
		int n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;n2=n3;
		}

	}

}
