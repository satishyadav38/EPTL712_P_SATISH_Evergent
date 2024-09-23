package com.evergent.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductBean prd=new ProductBean(100,"laptop",100000);
		
		System.out.println(prd.getPno());
		System.out.println(prd.getname());
		System.out.println(prd.getPrice());
	}

}
