package com.evergent.corejava.exceptionhandlingdemo;

public class ExceptionDemo7 {
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
			ExceptionDemo7 ed2=new ExceptionDemo7();
			ed2.myData();
		}
		catch(NullPointerException e)
   	 {
   		 System.out.println("i can handle :"+e);
   	 }
	}

}
