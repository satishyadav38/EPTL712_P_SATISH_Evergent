package com.evergent.corejava.javabeans;

public class StudentImpl {

	public static void main(String[] args) {
		StudentBean stu=new StudentBean();
		stu.setSno(100);
		stu.setSname("Ravi");
		stu.setAdd("Hyderabad");
		System.out.println(stu);
	}

}
