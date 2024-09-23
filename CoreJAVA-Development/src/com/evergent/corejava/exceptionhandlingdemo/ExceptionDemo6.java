package com.evergent.corejava.exceptionhandlingdemo;

public class ExceptionDemo6 {
     String name=null;
     int k=0;
     public void myData()
     {
    	 try {
    		 System.out.println("one");
    		 System.out.println(name.length());
    		 System.out.println("End");
    	 }
    	 finally {
    		 System.out.println("Finally block for closing db/network connections");
    	 }
     }
	public static void main(String[] args) {
		ExceptionDemo6 ed2=new ExceptionDemo6();
		ed2.myData();
	}

}
