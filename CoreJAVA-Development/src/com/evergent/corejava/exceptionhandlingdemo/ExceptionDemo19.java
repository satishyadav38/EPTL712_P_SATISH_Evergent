package com.evergent.corejava.exceptionhandlingdemo;
public class ExceptionDemo19 {
     String name=null;
     int k=0;
     public void myData() throws NullPointerException
     {
    	 
    		 System.out.println("one");
    		 System.out.println(name.length());
    		 System.out.println("End");
     }
	public static void main(String[] args) {
		try {
			ExceptionDemo19 ed2=new ExceptionDemo19();
			ed2.myData();
		}
		catch(NullPointerException| ArithmeticException e)
   	 {
   		 System.out.println("i can handle :"+e);
   	 }
	}

}
