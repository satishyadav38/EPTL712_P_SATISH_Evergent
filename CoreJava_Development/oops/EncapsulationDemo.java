package com.evergent.corejava.oops;

public class EncapsulationDemo {
      int a=10;int b=20;int c;
      public void display()
      {
    	  c=a+b;
    	  System.out.println("c"+"="+c);
      }
	public static void main(String[] args) {
	EncapsulationDemo ed=new EncapsulationDemo();
	ed.display();
	}

}
