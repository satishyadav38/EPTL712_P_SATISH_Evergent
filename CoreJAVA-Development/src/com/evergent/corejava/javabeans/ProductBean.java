package com.evergent.corejava.javabeans;
import java.io.Serializable;
public class ProductBean implements Serializable{
private int pno;
private String name;
private double price;
public ProductBean(int pno,String name,double price)
{
	this.pno=pno;
	this.name=name;
	this.price=price;
}
public int getPno()
{
	return pno;
}

public String getname()
{
	return name;
}

public double getPrice()
{
	return price;
}
}
