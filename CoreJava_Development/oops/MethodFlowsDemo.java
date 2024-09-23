package com.evergent.corejava.oops;
public class MethodFlowsDemo {
   public void show()
   {
	   System.out.println("No parameter,no return type");
	   }
   public void display(int a,int b)
   {
	   int c=a+b;
	   System.out.println("with parameter,without return type"+" "+c);   }
   public int swap()
   {
	   int a=10;int b=20;
	   int temp=a;
	   a=b;b=temp;
	   System.out.print("no parameter ,with return type ");
	   return a/b;
	   }
   public int mul(int a,int b)
   {
	   return a*b;}
	public static void main(String[] args) {
		MethodFlowsDemo md=new MethodFlowsDemo();
		md.show();md.display(100, 200);
		System.out.println(md.swap());System.out.println(md.mul(15,13));
	}
}
