package com.capg.farmequipment.satish.controller;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import com.capg.farmequipment.satish.services.RentalService;




public class FarmEquipmentController {
public static void main(String args[])
{
	int equipId=0;
	String farmerName="";
	long mobileNumber=0;
	double balance=0;
	int customerId=0;
	int months=0;
	int ch,ch1=1;
	Scanner s=new Scanner(System.in);
	System.out.println("------------------------WELCOME TO YOUR FARM EQUIPMENT RENTAL SERVICES---------------------");
	RentalService rentalService = new RentalService();
	while(ch1!=0)
	{
		
		System.out.println("1.Create a New Account");
		System.out.println("2.Show Account Balance");
		System.out.println("3.Deposite Money");
		System.out.println("4.Withdraw Money");
		System.out.println("5.Rent equipment");
		//System.out.println("6.Print Transactions");
		System.out.println("Enter your choice :");
		ch=s.nextInt();
		switch(ch)
			{
			case 1:
				System.out.println("Generate customer id");
				customerId = s.nextInt();
				System.out.println("Enter Name");
				farmerName = s.next();	
				System.out.println("Enter Mobile Number:");
				mobileNumber=s.nextLong();
				System.out.println("Enter mini balance greater than 5000");
				balance = s.nextDouble();
				int updateCount = rentalService.createAccount(customerId,farmerName,mobileNumber,balance);	
				System.out.println(updateCount+" customerId Created successfully");
				break;
				
			case 2:
				try
					{
					System.out.println("Enter your customer id");
					 customerId=s.nextInt();
				 balance=rentalService.showBalance(customerId);
					System.out.println("Your Account Balance: "+balance);
					}catch(Exception e){e.printStackTrace();}
					break;
					
			case 3:
				try
					{	
					System.out.println("Enter the customer Id to deposite");
					int b=s.nextInt();
					System.out.println("Enter the amount to be deposited");
					double c=s.nextDouble();
					double a =rentalService.deposite(b,c);
					System.out.println("Amount deposited successfully\n Your current account balance is: "+a);
					}catch(Exception e){e.printStackTrace();}
					break;
			case 4:
				try {
					System.out.println("Enter the Customer Id");
					int b=s.nextInt();
					System.out.println("Enter the amount to withdraw");
					double c = s.nextDouble();	
					int a=rentalService.withdraw(b,c);
					if(a==0)
					{
						 balance=rentalService.showBalance(b);
						System.out.println("You do not have sufficient fund to withdraw\n Your Account Balance is: "+balance);
					}
					else {
						 balance=rentalService.showBalance(b);
						System.out.println("Collect Your Money\n Your Account Balance is: "+balance);
					}
					
				}catch(Exception e) {e.printStackTrace();}
				break;
				
			case 5:
			{
				System.out.println("Enter the cutomer Id to rent the equipment");
				int cId=s.nextInt();
				System.out.println("Enter the equipment Id to rent ");
				int eId=s.nextInt();
				System.out.println("Enter the equipment Id to rent ");
				double eValue=s.nextDouble();
				System.out.println("Enter the the number of months for rent the eqiupment");
				double rentPeriodInMonths=s.nextDouble();
				double tAmount=eValue*rentPeriodInMonths;
				int rs=rentalService.ftrans(cId,eId,tAmount);
				if(rs!=0)
				{
					 balance=rentalService.showBalance(cId);
					System.out.println("Equipment "+eId+"rented   Successfully\n to customer: "+cId);
				}
				else {
					 balance=rentalService.showBalance(cId);
					System.out.println("You do not have sufficient fund to rent the eqiupment: "+balance);
				}
				break;
			}
//			case 6:
//			{
//				System.out.println("Enter the Customer Id");
//				 customerId=s.nextInt();
//				String tran=rentalService.getTransaction(customerId);
//				System.out.println("---------------YOUR TRANSATIONS ARE---------------\n");
//				System.out.println(tran);
//				break;
//			}
			default:
					System.out.println("Enter Valid Choice");
					break;
			
			}
		System.out.println("\nEnter 1 to perform More Operations and 0 for Exit :");
		ch1=s.nextInt();
		}
		
}
}
