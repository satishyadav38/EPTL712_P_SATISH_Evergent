package com.evergent.corejava.interfacesdemo;

public class BookImpl2 implements Book {
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
	public static void main(String[] args) {
		//BookImpl2 book1=new BookImpl2();
		Book book2=new BookImpl();//creating objecting reference for interface
		book2.bookTitle();
		book2.bookAuthor();
		book2.bookPrice();
		//book2.show();          //we cant see or use the class methods using interface object reference
	}
}
