package com.evergent.corejava.CollectionFramework;
import java.util.*;
class Book
{
	String name;
	public Book(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
}
public class CF9_ArrayList_BookObject {

	public static void main(String[] args) {
		Book b1=new Book("core Java");
		Book b2=new Book("Let us C");
		Book b3=new Book("Java Index");
		ArrayList l=new ArrayList();
		l.add(b1);
		l.add(b2);
		l.add(b3);
		System.out.println(l);

	}

}
