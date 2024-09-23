package com.evergent.corejava.abstract1;
//abstract is a keyword ,can declare methods and classes as abstract
//if a class declared as abstract then it must contain  atleast one abstract method
//and any number of concrete methods in it
//if any class extends abstract class then the subclass should implement 
//all the abstract  methods defined in its super abstract class
//we can't create object to abstract class but we can create reference to the abstract class
abstract  class Product{
	abstract public void newProduct();//abstract method 
	public void allProduct()           //concrete method
	{
		System.out.println("All Products");
	}
}
public class ProductImpl extends Product {   //class which extends abstract class should 
	public void show()                       //implement all abstract methods from abstract super class
	{
		System.out.println("Local show Methods");
	}
	public void newProduct()
	{
		System.out.println("My New Product");
	}
	public static void main(String[] args) {
		ProductImpl product1=new ProductImpl();
		product1.show();
		product1.allProduct();
		product1.newProduct();
	}
}
