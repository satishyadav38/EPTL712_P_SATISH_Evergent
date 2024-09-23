package com.evergent.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEno(712);
		emp.setEname("satish");
		emp.setSal(26900);
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
	}

}
