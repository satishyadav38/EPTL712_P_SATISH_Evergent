package com.evergent.corejava.constructordemo;

public class Employee3 {
	int eno;
	String ename;
	double sal;
  Employee3()
  {
	  System.out.println("Constructor Demo");
  }
  Employee3(int eno,String ename,double sal)
  {
	  this.eno=eno;this.ename=ename;this.sal=sal;
  }
  public void show()
  {
	  System.out.println("Employee No"+" "+eno);
	  System.out.println("Employee Name"+" "+ename);
	  System.out.println("Employee Salary"+" "+sal);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee3();
		Employee3 emp=new Employee3(712,"SATISH",26900);
		emp.show();

	}

}
