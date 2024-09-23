package com.evergent.corejava.collections.stack;
import java.util.*;
public class Stack_Demo5_Methods {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push("RED");
		st.push("BLACK");
		st.push("WHITE");
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
