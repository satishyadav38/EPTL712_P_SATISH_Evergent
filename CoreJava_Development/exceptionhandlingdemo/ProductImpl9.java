package com.evergent.corejava.exceptionhandlingdemo;
class ProductNotFoundException extends Exception
{
	public ProductNotFoundException(String message)
	{
		System.out.println("Hello: "+message);
	}
}
public class ProductImpl9 {
      int pno=105;
      public void myData()throws ProductNotFoundException
      {
    	  if(pno>100)
    	   throw new ProductNotFoundException("this product not there");
    	  else
    		  System.out.println("Product is there");
      }
	public static void main(String[] args) {
		try {
			ProductImpl9 p1=new ProductImpl9();
			p1.myData();
		}
		catch(Exception e)
		{
			System.out.println("i can handle" +e);
			
		}
		try {
			int c=10/0;
		}
		catch(Exception e)
		{
		System.out.println(e);
			
		}
		
	}
}
