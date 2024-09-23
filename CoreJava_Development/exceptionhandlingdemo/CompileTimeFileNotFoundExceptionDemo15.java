package com.evergent.corejava.exceptionhandlingdemo;
import java.io.*;
import java.util.Scanner;

public class CompileTimeFileNotFoundExceptionDemo15 {

	public static void main(String[] args) {
		try {
			File f=new File("C:\\Users\\satish.puttapalli\\Documents\\w1.txt");
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
