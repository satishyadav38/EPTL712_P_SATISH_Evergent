package com.evergent.corejava.hashmap.satish_application9;
import java.util.*;
import java.util.Map;
public class EmployeeMngtSytm {
	 Employee e=new Employee();
	 HashMap<Integer,Employee>employeeMap=new HashMap<>();
	public void add(int eid,String ename,String edept)
    {
		if(!employeeMap.containsKey(eid))
		{
		 e.setEid(eid);
    	 e.setEname(ename);
     	 e.setEdept(edept);
     	 employeeMap.put(eid, e);
		}
		else
			System.out.println("Employee details already exist");
    }
	public void retrieve(int eid)
	{
		if(employeeMap.containsKey(eid))
	   System.out.println(employeeMap.get(eid));
		else
			System.out.println("Employee id not found pls add employee details");
	}
	public void update(int eid,String ename,String edept)
	{
		if(employeeMap.containsKey(eid))
		{
			e.setEname(ename);
			e.setEdept(edept);
		}
		else
		System.out.println("Employee id not found pls add employee details");
	}
	public void delete(int eid)
	{
		if(employeeMap.containsKey(eid))
		{
			employeeMap.remove(eid);
		}
		else
			System.out.println("Employee id not found pls add employee details");
	}
	public void displayAll()
	{
		System.out.println(employeeMap);
	}
     public static void main(String[] args)
     {
    	 Scanner sc=new Scanner(System.in);
    	 HashMap<Integer,Employee>employeeMap=new HashMap<>();
    	 EmployeeMngtSytm ems=new EmployeeMngtSytm();
       
   	 for(;;) {
   		 System.out.println("Enter the operation "+ ":1 for add Employee ,2 for retrieve employee informztion,3-update ,4-delete,5-deleteAll");
         int number=sc.nextInt();
         int eid=0;
         String ename="";
    	 String edept="";
        switch(number)
        {
           
        	case 1:
        		System.out.println("Enter the  employee id,name,and dept to add employee details");
        		  eid=sc.nextInt();
            	  ename=sc.next();
            	  edept=sc.next();
        		ems.add(eid,ename,edept);
        		break;
        	case 2:
        		System.out.println("Enter the  employee id to retrieve info of employee");
        		 eid=sc.nextInt();
        		ems.retrieve(eid);
        		break;
        	case 3:
        		System.out.println("Enter the  employee id to update");
        	    eid=sc.nextInt();
        	    System.out.println("Enter the  employee Name");
        	    ename=sc.next();
        	    System.out.println("Enter the  employee department");
        		edept=sc.next();
        		ems.update(eid,ename,edept);
        		break;
        	case 4:
        		System.out.println("Enter the  employee id to remove");
        		eid=sc.nextInt();
        		ems.delete(eid);
        		break;
        	case 5:
        		System.out.println("Displays all employers details");
        		ems.displayAll();
        		break;
        		
        }
     }
	
     }
}
