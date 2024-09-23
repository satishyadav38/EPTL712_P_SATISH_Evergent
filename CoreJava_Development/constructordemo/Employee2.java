package com.evergent.corejava.constructordemo;

public class Employee2 {
	int eno;
	String ename;
	double sal;
  Employee2()
  {
	  System.out.println("Constructor Demo");
  }
  Employee2(int eno1,String ename1,double sal1)
  {
	  eno=eno1;ename=ename1;sal=sal1;
	System.out.println("Employee No\n"+eno+"Employee Name\n"+ename+"Employee Salary\n"+sal); 
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee2();
		new Employee2(712,"SATISH",26900);

	}

}
