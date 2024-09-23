package com.evergent.corejava.abstract1;
abstract  class Product3{
	//we can create constructor to abstract class but we can't create object to it
	//even there is no object to abstract class,the constructor we be executed
	//since we extend the abstract class and create a object to subclass
	//the constructor of super class will be executed first before constructor of subclass
	public Product3(){
		System.out.println("Product3 constructer:abstract class");
	}
	abstract public void newProduct();
}
public class ProductImpl3 extends Product3 {
	ProductImpl3()
	{
		System.out.println("Product:Constructor");
	}
	public void show() {
		System.out.println("Local show method");
	}
	public void newProduct() {
	  System.out.println("this is a abstract method of super class");}
	public static void main(String[] args) {
		ProductImpl3 prd=new ProductImpl3();
		prd.show();
		prd.newProduct();
	}
}
