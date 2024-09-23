package com.evergent.corejava.satish.application5;
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//String name=sc.next();
		KidUsers ku=new KidUsers();
		try {
			
		ku.Name("satish");
		ku.registerAccount(10);
		ku.requestBook("Kids");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		try {
		ku.Name("Guru");
		ku.registerAccount(18);
		ku.requestBook("Fiction");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		AdultUser au=new AdultUser();
		try{
		au.Name("Akhil");
		au.registerAccount(5);
		au.requestBook("Kids");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		try {
		au.Name("Bhargav");
		au.registerAccount(23);
		au.requestBook("Fiction");
		}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		
	}

}
}