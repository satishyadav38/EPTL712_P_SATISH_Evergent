package com.evergent.corejava.oops;
class MyDetails{
 String name="satish";
String address="chittanur";
int age=21;
public void personInfo() {
	//this.address=address;this.age=age;
	System.out.println("MyDetails");
}
}
class EducationDetails extends MyDetails{
	public void display(String program,String clg,String branch,int year)
	{
		System.out.println("Hi iam"+" "+name+" "+"i came from"+" "+address+" "+"iam"+" "+age+"years old");
		//System.out.println(program);
		//System.out.println();
		System.out.print("i have completed my"+" "+program+" ");
		System.out.print("at"+" "+clg+" "+"and specialized in");
		System.out.print(" "+branch+" ");
		System.out.println("passed out in"+" "+year);
	}
}
public class MultilevelInheritanceDemo extends EducationDetails  {

	public static void main(String[] args) {
		//String program='btec'
		MultilevelInheritanceDemo md=new MultilevelInheritanceDemo();
		md.personInfo();
		md.display("btech","griet","It",2024);
	}

}
