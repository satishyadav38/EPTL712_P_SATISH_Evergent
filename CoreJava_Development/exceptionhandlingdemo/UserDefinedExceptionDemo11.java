package com.evergent.corejava.exceptionhandlingdemo;
class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String message)
	{
		//System.out.println("Hello: "+message);
		super(message);
	}
}
public class UserDefinedExceptionDemo11 {
      
      public void withdraw( double amount)throws InsufficientFundsException
      {
    	  double balance=5000;
    	  if(balance<amount)
    	   throw new InsufficientFundsException("insufficient balance");
    	  else
    		  System.out.println("Access granted -balance are enough");
      }
	public static void main(String[] args) {
		try {
			double amount=6000;
			UserDefinedExceptionDemo11 p1=new UserDefinedExceptionDemo11();
			p1.withdraw(amount);
		}
		catch(Exception e)
		{
			System.out.println("i can handle" +e.getMessage());
			
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
