package com.evergent.corejava.static_finalDemo;
public class StaticDemo3 {
      static String name="Satish";
      static int empno;
      static int age=21;
    public static void display(int empno) {
    	
    	System.out.println(empno);
    	//staticDemo3.show();
    	//above accessing non ststic method show from static method display 
    	//so it is giving error
    	//System.out.println(age);
    }
    public void show()
    {
    	display(713); //non static method accessing ststic method directly	
    }
	public static void main(String[] args) {
		display(712); //static method accessing static method directly
		System.out.println(age);  //static method accessing static variable directly
		
		StaticDemo3 sd2=new StaticDemo3();  //creating a object and referncing to access non static methods and variables
		sd2.show();                         //accessing non ststic method from static method using object reference;
		//staticDemo2.show("male");
	}
}
