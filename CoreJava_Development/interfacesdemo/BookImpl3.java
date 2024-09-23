package com.evergent.corejava.interfacesdemo;

public class BookImpl3 implements Book,NewBook {
	public void bookTitle()
	{
		System.out.println("Core Java");
	}
	public void bookAuthor()
	{
		System.out.println("Orcale core");
	}
	public void bookPrice() {
		System.out.println("Rs 255");
	}
	public void show()
	{
		System.out.println("This is a local method");
	}
	public void addNewBook()
	{
		System.out.println("This is a added book");
	}
	public void myDetails()
	{
		System.out.println(cname);
		System.out.println("This is a method which is overriden from another interface by extending");
	}
	public static void main(String[] args) {
		BookImpl3 book1=new BookImpl3();
		//Book book2=new BookImpl();//creating objecting reference for interface
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.addNewBook();
		book1.myDetails();
		book1.show();          //we cant see or use the class methods using interface object reference
	}
}
