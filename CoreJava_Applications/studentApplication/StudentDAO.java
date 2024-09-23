package com.evergent.corejava.studentApplication;

import java.util.ArrayList;

public class StudentDAO {
	
	                       //  100  corejava 250   c
	public int addStudent(StudentBean studentBean)
	{
		try{
			ArrayList bookList=new ArrayList();
			bookList.add(studentBean.getStudentId());
			bookList.add(studentBean.getName());
			bookList.add(studentBean.getMarks());
			bookList.add(studentBean.getGrade());	
			
			System.out.println(bookList);
			
			System.out.println("student ID :"+studentBean.getStudentId());
			System.out.println("student Name :"+studentBean.getName());
			System.out.println("student Marks :"+studentBean.getMarks());
			System.out.println("student Grade :"+studentBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}