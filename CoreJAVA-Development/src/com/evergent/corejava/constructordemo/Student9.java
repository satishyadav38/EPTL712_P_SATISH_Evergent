package com.evergent.corejava.constructordemo;
public class Student9 {
	String name;
	int age;
	public Student9(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Student9(Student9 S) {
		this.name=S.name;
		this.age=S.age;
	}
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student9 s1=new Student9("Bhanu",20);
		Student9 s2=new Student9(s1);
		s1.display();
		s2.display();

	}

}
