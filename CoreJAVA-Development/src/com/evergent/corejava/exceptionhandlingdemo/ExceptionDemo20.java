package com.evergent.corejava.exceptionhandlingdemo;
public class ExceptionDemo20 {
     String name=null;
     int k=0;
     public void myData() throws NullPointerException
     {
    	 try {
    		 System.out.println(name.length());
    		 try {
    			 int t=10/k;    
    			 }
    			 catch(ArithmeticException e)
    			 {
    				 System.out.println(e);
    			 }
    		 finally {
    			 System.out.println("Inner try loop");
    		 }
    	 }
    		 catch(NullPointerException e)
    		 {
    			 System.out.println(e);
    		 }
    	 finally {
    		 System.out.println("outer try loop");
    	 }
    	 }
    	 
	public static void main(String[] args) {
			ExceptionDemo20 ed2=new ExceptionDemo20();
			ed2.myData();
	}
}
