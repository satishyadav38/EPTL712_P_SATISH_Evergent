package com.evergent.corejava.exceptionhandlingdemo;
import java.util.*;
class InvalidGameException extends Exception
{
	public InvalidGameException(String message)
	{
		//System.out.println("Hello: "+message);
		super(message);
	}
}
public class UserDefinedExceptionSatish {
      
      public void gameList(int gameId)throws InvalidGameException
      {
    	  if(gameId>100)
    	   throw new InvalidGameException("the game u entered is not in the list");
    	  else
    		  System.out.println("Access granted -You can now play and enjoy pandagoww");
      }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		try {
			UserDefinedExceptionSatish p1=new UserDefinedExceptionSatish();
			p1.gameList(sc.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("i can handle   " +e.getMessage());
			
		}
		}
		
	
}
