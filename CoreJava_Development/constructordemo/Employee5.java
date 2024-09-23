package com.evergent.corejava.constructordemo;
public class Employee5 {
	int eno;
	String ename;
	double sal;
	Employee5(){
		System.out.println("default constructor");
	}
	Employee5(int eno){
		this.eno=eno;
	}
	Employee5(int eno,String ename,double sal){
		this(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Employee no:"+eno);
		System.out.println("Employee ename:"+ename);
		System.out.println("Emplyee salary:"+sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee5();
		Employee5 emp5=new Employee5(123,"raj",50000);
		emp5.display();
	}
}