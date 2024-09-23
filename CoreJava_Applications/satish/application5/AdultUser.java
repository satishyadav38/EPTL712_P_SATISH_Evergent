package com.evergent.corejava.satish.application5;

public class AdultUser implements LibraryUser {
	public void Name(String name) {
	System.out.println("Name of the user is:"+name);
	}
public void registerAccount(int age ) throws AgeNotValidException
{
	if (age>12)
	{
		System.out.println("You have successfully registered under an adult account");
	}
	else
	{
		throw new AgeNotValidException("Sorry,Age must be greater than 12 to register as an adult");
	}
}
public void requestBook(String bType) throws InValidBookTypeException
{
	if(bType=="Fiction")
	{
		System.out.println("Book issued Successfully,please return the book within 7days");
	}
	else
		throw new InValidBookTypeException("OOPS!,you are allowed to take only adult Fiction books");
}


}
