package com.evergent.corejava.exceptionhandlingdemo;
public class ExceptionDemo5 {
     String name=null;int k=0;
     public void myData()
     {
    	 try {
    		 System.out.println("one");
    		 System.out.println(name.length());
    		 int t=10/k;
    		 System.out.println("End");
    	 }
    	 catch(NullPointerException e)
    	 {
    		 System.out.println("i can handle :"+e);}
    	 catch(ArithmeticException e)
    	 {
    		 System.out.println("i can handle :"+e);}
    	 catch(Exception e)
    	 {
    		System.out.println(e);}
    	 finally {
    		 System.out.println("Finally block for closing db/network connections");}
     }
	public static void main(String[] args) {
		ExceptionDemo5 ed3=new ExceptionDemo5();
		ed3.myData();
	}
}