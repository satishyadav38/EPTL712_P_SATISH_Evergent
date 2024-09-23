package com.evergent.corejava.interfacesdemo;

public class BookImpl implements Book
{
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
		BookImpl book1=new BookImpl();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
	}
}
