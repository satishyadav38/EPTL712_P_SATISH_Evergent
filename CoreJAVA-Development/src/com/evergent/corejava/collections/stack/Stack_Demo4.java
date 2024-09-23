package com.evergent.corejava.collections.stack;
import java.util.*;
public class Stack_Demo4 {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push("Apple");
		st.push("Banana");
		st.push("Cherry");
		st.push("Date");
		System.out.println(st);
		String topE=(String) st.peek();
		System.out.println(topE);
		String remE=(String)st.pop();
		System.out.println(remE);
		Boolean b=st.isEmpty();
		System.out.println(b);
		int p=st.search("Banana");
		if(p!=1)
			System.out.println("Position of Banana in stack from top is "+p);
			else
				System.out.println("Banana not found");
		
		st.clear();
		System.out.println(st);
		
		//System.out.println(st.pop());

	}

}
