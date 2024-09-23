package com.evergent.corejava.WrapperClasses;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		//float f1=4.5f;
		int i1=10;
		Integer t1=new Integer(i1);
		int i2=t1.intValue();
		double d1=799.01;
		Double d2=new Double(d1);
		double t2=d2.doubleValue();
		byte b1=10;
		Byte b2=new Byte(b1);
		byte b3=b2.byteValue();
		System.out.println(i1);
		System.out.println(t1);
		System.out.println(i2);
		System.out.println(d1);	
		System.out.println(d2);
		System.out.println(t2);
		System.out.println(b1);	
		System.out.println(b2);	System.out.println(b3);
	}

}
