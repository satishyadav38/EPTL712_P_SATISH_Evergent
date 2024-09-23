package com.evergent.corejava.ram.Collection.map;
import java.util.*;
public class TreeMapDemo4 {
//no duplicate keys are allowed ,but duplicate values are accepted
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(712,"Satish");
		hm.put(713,"Akhil");
		hm.put(714,"guru");
		hm.put(715,"Sandeep");
		hm.put(718,"Bhargav");
		//hm.put(,null);
		hm.put(700, "to evergent");
		System.out.println(hm);
		for(Map.Entry<Integer,String>e:hm.entrySet())
			System.out.println("ID:"+e.getKey()+"   Name:"+e.getValue());
	}

}
