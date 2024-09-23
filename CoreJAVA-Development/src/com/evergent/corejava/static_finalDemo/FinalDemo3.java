package com.evergent.corejava.static_finalDemo;
final class My
{
	final public void myProducts()
	{
		System.out.println("All Products");
	}
}
public class FinalDemo3 //extends MyClass
{
final String cname="India";
public void myProducts1()
{
	System.out.println("Hello World");
}
public void myData()
{
	System.out.println("cname "+cname);
}
	public static void main(String[] args) {
		FinalDemo3 fd=new FinalDemo3();
		fd.myData();
		fd.myProducts1();
	}

}
