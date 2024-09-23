package com.evergent.corejava.ram.Collection.map;
import java.util.*;
public class HashTableDemo2 {
//no duplicate keys are allowed ,but duplicate values are accepted
	public static void main(String[] args) {
		Hashtable hm=new Hashtable();
		hm.put(100,"Satish");
		hm.put(200,"Akhil");
		hm.put(300,"guru");
		hm.put("400","Sandeep");
		////hm.put(null,"Bhargav");
		//hm.put(700,null);
		hm.put("Welcome", "to evergent");
		System.out.println(hm);
	}

}
