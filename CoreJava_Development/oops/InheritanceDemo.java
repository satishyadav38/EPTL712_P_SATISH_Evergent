package com.evergent.corejava.oops;
class EncapsulationDemo1 {
    int a=10;int b=20;int c;
    public void display()
    {
  	  c=a+b;
  	  System.out.println("c"+"="+c*20);
    }
}
public class InheritanceDemo extends EncapsulationDemo1 {

	public static void main(String[] args) {
		EncapsulationDemo1 id=new EncapsulationDemo1 ();
		id.display();

	}

}