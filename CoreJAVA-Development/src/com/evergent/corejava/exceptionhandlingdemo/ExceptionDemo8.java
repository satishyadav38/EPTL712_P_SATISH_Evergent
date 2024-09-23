package com.evergent.corejava.exceptionhandlingdemo;
   
public class ExceptionDemo8 {
	 int  n=0;
     public  void  show()throws ArithmeticException 
     {
    	 System.out.println("one");
    	 System.out.println(10/n);
    	 System.out.println("End");
     }
     public  void display()throws ArithmeticException 
     {
    	 show();
    	 System.out.println("display method");
     }
	public static void main(String[] args) {
		ExceptionDemo8 ed8=new ExceptionDemo8();
		try {
			ed8.display();
		}
		catch(Exception e)
		{
			System.out.println("I can handle:"+e);
		}
	}

}
