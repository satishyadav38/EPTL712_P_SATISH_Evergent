package com.evergent.corejava.privateandobjectclassmethods;
class Person1{
	String name;
	int age;
	public  Person1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return name+age;
	}
}
public class PersonData {

	public static void main(String[] args) {
		
		Person1 p1=new Person1("Satish",22);
		System.out.println(p1);

	}

}
