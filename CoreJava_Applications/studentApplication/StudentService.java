package com.evergent.corejava.studentApplication;

//package com.evergent.corejava.bookapplication;
public class StudentService {
	                           //100      corejava    250
	public int addStudentService(int studentId,String name,float marks)
	{  String grade="";
	
	   if(marks<=35)
	   {
		   grade = "C";
	   }
	   else if(marks<=75)
	   {
		   grade = "B";
		   
	   }
	   else
	   {
		   grade = "A";
	   }
		
		
	   StudentDAO studentDAO = new StudentDAO();
	   StudentBean studentBean=new StudentBean();
	   studentBean.setStudentId(studentId);	
	   studentBean.setName(name);
	   studentBean.setMarks(marks);
	   studentBean.setGrade(grade);
	
		   int updateResult= studentDAO.addStudent(studentBean);
		
		return 1;
	} 
}