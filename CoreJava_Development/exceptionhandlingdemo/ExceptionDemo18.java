package com.evergent.corejava.exceptionhandlingdemo;

public class ExceptionDemo18 {
     String name=null;
     int k=0;
     public void myData() throws NullPointerException,ArithmeticException 
     {
    	 
    		 System.out.println("one");
    		 System.out.println(name.length());
    		 System.out.println("End");
     }
	public static void main(String[] args) {
		
		try {
			ExceptionDemo18 ed2=new ExceptionDemo18();
			ed2.myData();
		}
		catch(NullPointerException e)
   	 {
   		 System.out.println("i can handle :"+e);
   	 }
	}

}
