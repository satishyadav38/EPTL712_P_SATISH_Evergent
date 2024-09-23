package com.evergent.corejava.ram.application1_3;
interface EmployeeInterface{
	public void employeeInfo(int eno,float sal);
	public void employeeAddress(String add);
	public void employeeDetails();
}
abstract class BankAccountDetails{
	abstract public void accountDetails();
	public void bankDetails()
	{
		System.out.println("my Bank is ICICI...");
	}
}
class BankRBI{
	static {
		System.out.println("Welcome to employee Details");
	}
	public BankRBI() {
		System.out.println("RBi Bank Home Loan& Personal Loan Interst");
	}
	public BankRBI(double p,double r)
	{
		System.out.println(p*r/100);
	}
	public static final void getBankDetails()
	{
		System.out.println("Home Loan Interest is 8.5");
		System.out.println("Personl Loan Interest is 11%");
	}
}
public class EmployeeInformation3 extends BankAccountDetails implements EmployeeInterface {
  int empno;
  double sal;
  String address;
  //Interface override methods
  public void employeeInfo(int eno,float sal)
  {
	  this.empno=eno;
	  this.sal=sal;
  }
  public void employeeAddress(String add)
  {
	  this.address=add;
  }
  public void employeeDetails()
  {
	  System.out.println("Employee no:"+empno);
	  System.out.println("Employee sal:"+sal);
	  System.out.println("Employee Address:"+address);
  }
  public void accountDetails()
  {
	  System.out.println("MY ACCOUNT DETAILS IS:12345678");
  }
  public void show()
  {
	  System.out.println("this is show local method");
  }
  public static void main(String[]args)
  {
	  EmployeeInformation3 emp=new EmployeeInformation3();
	  emp.employeeInfo(100,5000);
	  emp.employeeAddress("Banglore");
	  emp.employeeDetails();
	  emp.accountDetails();
	  emp.bankDetails();
	  BankRBI rbi=new BankRBI();
	  BankRBI rbi1=new BankRBI(3.3,3.3);
	  BankRBI.getBankDetails();
	  emp.show();
  }
}
