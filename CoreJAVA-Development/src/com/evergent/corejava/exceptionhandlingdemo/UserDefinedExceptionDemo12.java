package com.evergent.corejava.exceptionhandlingdemo;
class InvalidScoreException extends Exception
{
	public InvalidScoreException(String message)
	{
		//System.out.println("Hello: "+message);
		super(message);
	}
}
public class UserDefinedExceptionDemo12 {
      
      public void validateScore( int score)throws InvalidScoreException
      {
    	  //double balance=5000;
    	  if(score<0||score>100)
    	   throw new InvalidScoreException("score is more than 100");
    	  else
    		  System.out.println("you are not selected");
      }
	public static void main(String[] args) {
		try {
			//double amount=6000;
			UserDefinedExceptionDemo12 p1=new UserDefinedExceptionDemo12();
			p1.validateScore(110);
		}
		catch(Exception e)
		{
			System.out.println("i can handle   " +e.getMessage());
			
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
