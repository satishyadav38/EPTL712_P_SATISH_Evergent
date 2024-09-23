package com.evergent.corejava.exceptionhandlingdemo;

public class ExceptionDemo2 {
     String name=null;
     int k=0;
     public void myData()
     {
    	 try {
    		 System.out.println("one");
    		 System.out.println(name.length());
    		 System.out.println("End");
    	 }
    	 catch(NullPointerException e)
    	 {
    		 System.out.println("i can handle :"+e);
    	 }
     }
	public static void main(String[] args) {
		ExceptionDemo2 ed2=new ExceptionDemo2();
		ed2.myData();
	}

}
