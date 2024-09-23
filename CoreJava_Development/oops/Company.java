package com.evergent.corejava.oops;

class Employee{  
	void work(){
		System.out.println("working in office...");}  
	}  
	class Trainee extends Employee{  
	void learn(){
		System.out.println("learning in office...");}  
	}  
	public class Company{  
	public static void main(String args[]){  
	 Trainee t=new Trainee();  
	t.learn();  
	t.work();  
	}}  
