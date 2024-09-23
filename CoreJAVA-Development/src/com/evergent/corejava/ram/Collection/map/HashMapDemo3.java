package com.evergent.corejava.ram.Collection.map;
import java.util.*;
public class HashMapDemo3 {
//no duplicate keys are allowed ,but duplicate values are accepted
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("P","Satish");
		hm.put("Akula","Akhil");
		hm.put("Avula","guru");
		hm.put("Gummadivelli","Sandeep");
		hm.put("Thatikonda","Bhargav");
		//hm.put(,null);
		hm.put("Welcome", "to evergent");
		System.out.println(hm);
		for(String s:hm.keySet())
			System.out.println(s);
	}

}
