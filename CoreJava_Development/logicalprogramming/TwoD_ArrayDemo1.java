package com.evergent.corejava.logicalprogramming;

public class TwoD_ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]=new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				ar[i][j]=7;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("");
			for(int j=0;j<5;j++)
			{
				System.out.printf(ar[i][j]+" ");
			}
		}
	}

}
