package com.evergent.corejava.hashmap.satish_application9;
import java.io.Serializable;
public class Employee implements Serializable{
   private int eid;
   private String ename;
   private String edept;
   public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEdept() {
	return edept;
}
public void setEdept(String edept) {
	this.edept = edept;
}
public String toString()
{
	return "Employee id: "+eid +"Employee name "+ename +"Employee dept "+edept;
}
}
