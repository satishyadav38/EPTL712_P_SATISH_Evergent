package com.evergent.corejava.static_finalDemo;

public class FinalDemo1 {

	final String cname="India";
	public void myData()
	{
		//cname="welcome";
		System.out.println("cname "+cname);
	}
	public static void main(String[] args) {
	FinalDemo1 fd=new FinalDemo1();
	fd.myData();
	}

}
