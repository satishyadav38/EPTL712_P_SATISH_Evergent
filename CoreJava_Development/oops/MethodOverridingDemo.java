package com.evergent.corejava.oops;
class MyBigData{
	public void myData()
	{
		System.out.println("myBigData:classMethod");
	}
}
public class MethodOverridingDemo extends MyBigData {
public void myData()
{
	System.out.println("MyData");
}
public void show()
{
	System.out.println("Local methods");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingDemo mod1=new MethodOverridingDemo();
		mod1.myData();
		mod1.show();
	}

}
