package com.evergent.corejava.generalprogramming;
/*
class add{
    public int run(int a,int b)
    {
        int c=a+b;
        return c;
    }
}*/
class HelloWorld  {
	int id;int age;
	String name;
	public HelloWorld() {
		this.run1();
	}
	public HelloWorld(int id,int age1) {
		this.id=id;
		age=age1;
	}
	public HelloWorld(int id,String name,int age) {
		this(id,age);
		this.name=name;
		//this(id);
	}
	public void run1() {
		System.out.println("Run");
	}
//    public int  run(int a,int b)
//    { 
//    	//int f=super.run(a,b);
//        int d=a-b;
//        System.out.println(d);
//        //return super.run(a,b);
//    }
    public static void main(String[] args) {
//        System.out.println("Try programiz.pro");
//    //    add h=new HelloWorld();
//       System.out.println( h.run(8,2));
    	new HelloWorld();
    }
}