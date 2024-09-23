package com.evergent.corejava.privateandobjectclassmethods;
 final class PersonImmutable{
private final String name;
private final int age;
public  PersonImmutable(String name,int age)
{
	this.name=name;
	this.age=age;
}
public String myName()
{
	return name;
}
public int myAge()
{
	return age;
}
}
public class MainPerson {

	public static void main(String[] args) {
		PersonImmutable p=new PersonImmutable("Satish",22);
		System.out.println(p.myName());
		System.out.println(p.myAge());
				
	}
	}


