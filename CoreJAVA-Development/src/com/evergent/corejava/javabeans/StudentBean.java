package com.evergent.corejava.javabeans;
import java.io.Serializable;
public class StudentBean implements Serializable{
private int sno;
private String sname;
private String add;
public void setSno(int sno)
{
	this.sno=sno;
}

public void setSname(String sname)
{
	this.sname=sname;
}

public void setAdd(String add)
{
	this.add=add;
}
public String toString()
{
	return "Student no:"+sno+"\n Student Name:"+sname+"\n Student address:"+add;
}
}
