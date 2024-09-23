package com.evergent.corejava.satish.application5;

public class KidUsers   implements LibraryUser{
public KidUsers()
{
	
}
public void Name(String name) {
	System.out.println("Name of the user is:"+name);	
}
public void registerAccount(int age) throws AgeNotValidException  {
	if(age<12)
	 {
		System.out.println("You have Successfully registerd under kids Account");
	 }
	else
	 {
		throw new AgeNotValidException("Sorry,Age must be less than 12 to register as a kid");
	 }
	
}
public void requestBook(String bookType) throws InValidBookTypeException{
	if(bookType=="Kids")
	 {
		 System.out.println("Book issued Successfully");
	 }
	 else
		throw new  InValidBookTypeException("OOPs!,you are allowed to take only adult Fiction books ");
}
}
