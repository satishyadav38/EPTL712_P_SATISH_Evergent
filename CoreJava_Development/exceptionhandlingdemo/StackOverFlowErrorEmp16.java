package com.evergent.corejava.exceptionhandlingdemo;

public class StackOverFlowErrorEmp16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  recursiveMethod();
          }
          catch(StackOverflowError e){
        	  System.out.println(e.getMessage());
          }
	}
	public static void recursiveMethod()
	{
		recursiveMethod();
	}

}
