package com.evergent.corejava.static_finalDemo;
class Myclass
{
	final public void myProducts()
	{
		System.out.println("All Products");
	}
}
public class FinalDemo2 //extends MyClass
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
		FinalDemo2 fd=new FinalDemo2();
		fd.myData();
		fd.myProducts1();
	}

}
