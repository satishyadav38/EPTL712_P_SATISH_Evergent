package com.evergent.corejava.oops;

public class MethodOverloadingDemo {
  int c=10;
	public void show()
	{
		System.out.println("Hi");
	}
	public int show1(int c,int b)
	{ 
		this.c=c;
		 c=c+b;
		return(c);
	}
	public float show(float a,float b,float c)
	{
		return (float)a-b-c;
	}
	public static void main(String[] args) {
		MethodOverloadingDemo mod= new MethodOverloadingDemo();
		mod.show();
		System.out.println(mod.show1(10,20));
		System.out.println(mod.show(20,2,1));
	}

}
