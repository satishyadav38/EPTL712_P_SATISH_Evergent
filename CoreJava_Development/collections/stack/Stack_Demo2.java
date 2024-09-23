package com.evergent.corejava.collections.stack;
import java.util.*;
public class Stack_Demo2 {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push("RED");
		st.push("BLACK");
		st.push("WHITE");
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);
		//System.out.println(st.pop());

	}

}
