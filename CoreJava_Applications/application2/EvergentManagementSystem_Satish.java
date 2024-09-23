package com.evergent.corejava.application2;
//import java.io.IOException;
import java.util.Scanner;

//import com.evergent.corejava.ram.application1.EventManagementSystem_RAM.module1;
//import com.evergent.corejava.ram.application1.EventManagementSystem_RAM.submodule1;
public class EvergentManagementSystem_Satish {
	enum module1 {ENTERTAINMENT,VEDIOGAMES,EXIT};
	enum submodule1 {CARRIERS,MEDIA,MAIN};
	enum submodule2  {AT,SINGTEL,TELKOMSEL,MAIN};
	enum submodule3  {BBC,AHA,SONY,MAIN};
	enum submodule4  {CRIC,CHESS,MAIN};
	enum submodule5 {M,Q,Y,MAIN};
	enum submodule6{H,D,W,MAIN};
	//static int monthCost;
	//static int Q_Cost;zzzzzzz
	//static int Y_Cost;
	static int H_NO;
	static int D_NO;
	static int W_NO;
	//static int amount;
	public static void main(String[] args) {
		
		String module = null;
		
		  Scanner br =new Scanner(System.in);
		  System.out.println("\n\t\t \t\t Welcome To EVERGENT TECHNOLOGIES");
	  while(true)
	   {                              //while-1open
		
		  
			System.out.println("======================");
			System.out.println(" EVERGENT Main Menu");
			System.out.println("======================");
			System.out.println("ENTERTAINMENT");
			System.out.println("VEDIOGAMES");
			//System.out.println("EXIT");
			System.out.println("EXIT-Quit Module");
			System.out.println("======================");
		    System.out.println("Enter your Module code (ENTERTAINMENT,VEDIOGAMES,EXIT) : ");

		    module=br.nextLine();
		    System.out.println("You entered module is  : " );   
       
		    switch(module1.valueOf(module))
		    {                                   //switch1open

		    case ENTERTAINMENT :
		    	
		    System.out.println(" ENTERTAINMENT Module");
		    System.out.println("======================");
		    System.out.println("CARRIERS-to select carriers");
		    System.out.println("MEDIA-to select media");
		    System.out.println("MAIN-Return to Main Menu");
		    System.out.println("======================");
		    System.out.println("Enter your Module code (CARRIERS,MEDIA,MAIN) : ");
		    module=br.nextLine();
		    switch(submodule1.valueOf(module))           //2-open
		    {

		    case CARRIERS:
		    	
		    	
		    	System.out.println("Menu \t Description  \t TYPES OF CARRIERS ");
		    	System.out.println("===============================================");
		    	System.out.println("AT-to select AT Carrier");
		    	System.out.println("");
		    	System.out.println("SINGTEL-to select SINGTEL carrier");
		    	System.out.println("");
		    	System.out.println("TELKOMSEL-to select TELKOMSEL carrier");
		    	System.out.println("===============================================");
		    	System.out.println("Enter your type of carrier(AT,SINGTEL,TELKOMSEL,MAIN) : ");
		    	
		    	
		    	module=br.nextLine();
		    	switch(submodule2.valueOf(module))
		    	{                                  //switch3open types of carriers
		    	case AT:
		    		System.out.println("Menu \t Description  \t TYPES OF subscription ");
			    	System.out.println("===============================================");
			    	System.out.println("M-monthly");
			    	System.out.println("");
			    	System.out.println("Q-quarterly");
			    	System.out.println("");
			    	System.out.println("Y-yearly");
			    	System.out.println("===============================================");
			    	System.out.println("Enter your type of subscription(M,Q,Y) : ");
			    	module=br.nextLine();
			    	switch(submodule5.valueOf(module))     //switch 4open cost
			    	{
			    	case M:
			    		 System.out.println("AMOUNT TO BE PAID"+75);
			    	 // System.out.println("monthly amount for AT is:" amount);
			    	  break;
			    	case Q:
			    		 System.out.println("AMOUNT TO BE PAID"+200);
			    	//  System.out.println("quarterly amount for AT is:"amount);
			    	   break;
			    	case Y:
			    		 System.out.println("AMOUNT TO BE PAID"+700);
			    	 // System.out.println("year amount for AT is:"amount);
			    	  break;
			    	}                                   //switch4 close
			    	break;
		    	case SINGTEL:
		    		System.out.println("Menu \t Description  \t TYPES OF subscription ");
			    	System.out.println("===============================================");
			    	System.out.println("M-monthly");
			    	System.out.println("");
			    	System.out.println("Q-quarterly");
			    	System.out.println("");
			    	System.out.println("Y-yearly");
			    	System.out.println("===============================================");
			    	System.out.println("Enter your type of subscription(M,Q,Y) : ");
			    	module=br.nextLine();
			    	switch(submodule5.valueOf(module))     //switch 4open cost
			    	{
			    	case M:
			    	  System.out.println("AMOUNT TO BE PAID"+80);
			    	 // System.out.println("monthly amount for SINGTEL is:"amount);
			    	  break;
			    	case Q:
			    		 System.out.println("AMOUNT TO BE PAID"+210);
			    	 // System.out.println(" Quarterly amount for SINGTEL is:"amount);
			    	   break;
			    	case Y:
			    		 System.out.println("AMOUNT TO BE PAID"+740);
			    	 // System.out.println(" Yearly amount for SINGTEL is:"amount);
			    	  break;
			    	}                                   //switch4 close
			    	break;
		    	case TELKOMSEL:
		    		System.out.println("Menu \t Description  \t TYPES OF subscription ");
			    	System.out.println("===============================================");
			    	System.out.println("M-monthly");
			    	System.out.println("");
			    	System.out.println("Q-quertly");
			    	System.out.println("");
			    	System.out.println("Y-yearly");
			    	System.out.println("===============================================");
			    	System.out.println("Enter your type of subscription(M,Q,Y) : ");
			    	module=br.nextLine();
			    	switch(submodule5.valueOf(module))     //switch 4open cost
			    	{
			    	case M:
			    	  //amount=60;
			    	 System.out.println("AMOUNT TO BE PAID"+60);
			    	  break;
			    	case Q:
			    	  System.out.println("AMOUNT TO BE PAID"+150);
			    	   break;
			    	case Y:
			    	  System.out.println("AMOUNT TO BE PAID"+500);
			    	  break;
			    	}                                   //switch4 close
			    	break;
		    	}
                break;
		    	
		   case MEDIA:
		   System.out.println("Menu \t Description  \t TYPES OF media ");
	    	System.out.println("===============================================");
	    	System.out.println("BBC-to select BBC");
	    	System.out.println("");
	    	System.out.println("AHA-to select AHA");
	    	System.out.println("");
	    	System.out.println("SONY-to select SONY");
	    	System.out.println("===============================================");
	    	System.out.println("Enter your type of media(BBC,AHA,SONY,MAIN) : ");
	    	
	    	
	    	module=br.nextLine();
	    	switch(submodule3.valueOf(module))
	    	{                                  //switch3open types of carriers
	    	case BBC:
	    		System.out.println("Menu \t Description  \t TYPES OF subscription ");
		    	System.out.println("===============================================");
		    	System.out.println("M-monthly");
		    	System.out.println("");
		    	System.out.println("Q-quertly");
		    	System.out.println("");
		    	System.out.println("Y-yearly");
		    	System.out.println("===============================================");
		    	System.out.println("Enter your type of subscription(M,Q,Y) : ");
		    	module=br.nextLine();
		    	switch(submodule5.valueOf(module))     //switch 4open cost
		    	{
		    	case M:
		    		int bbcMonthAmount=50;
			    	  System.out.println("AMOUNT TO BE PAID"+bbcMonthAmount);
		    	  break;
		    	case Q:
		    		int bbcQuarterAmount=125;
			    	  System.out.println("AMOUNT TO BE PAID"+bbcQuarterAmount);
		    	   break;
		    	case Y:
		    		//int bbcYearlyrAmount=450;
			    	  System.out.println("AMOUNT TO BE PAID"+450);
		    	  break;
		    	}                                   //switch4 close
		    	break;
	    	case AHA:
	    		System.out.println("Menu \t Description  \t TYPES OF subscription ");
		    	System.out.println("===============================================");
		    	System.out.println("M-monthly");
		    	System.out.println("");
		    	System.out.println("Q-quertly");
		    	System.out.println("");
		    	System.out.println("Y-yearly");
		    	System.out.println("===============================================");
		    	System.out.println("Enter your type of subscription(M,Q,Y) : ");
		    	module=br.nextLine();
		    	switch(submodule5.valueOf(module))     //switch 4open cost
		    	{
		    	case M:
		    		int ahaMonthAmount=50;
			    	  System.out.println("AMOUNT TO BE PAID"+ahaMonthAmount);
		    	  break;
		    	case Q:
		    		int ahaQuarterAmount=150;
			    	  System.out.println("AMOUNT TO BE PAID"+ahaQuarterAmount);
		    	   break;
		    	case Y:
		    		//int ahaYearlyrAmount=500;
			    	  System.out.println("AMOUNT TO BE PAID"+500);
		    	  break;
		    	}                                   //switch4 close
		    	break;
	    	case SONY:
	    		System.out.println("Menu \t Description  \t TYPES OF subscription ");
		    	System.out.println("===============================================");
		    	System.out.println("M-monthly");
		    	System.out.println("");
		    	System.out.println("Q-quertly");
		    	System.out.println("");
		    	System.out.println("Y-yearly");
		    	System.out.println("===============================================");
		    	System.out.println("Enter your type of subscription(M,Q,Y) : ");
		    	module=br.nextLine();
		    	switch(submodule5.valueOf(module))     //switch 4open cost
		    	{
		    	case M:
		    	  int sonyMonthAmount=80;
		    	  System.out.println("AMOUNT TO BE PAID"+sonyMonthAmount);
		    	  break;
		    	case Q:
		    	  int sonyQuarterAmount=220;
		    	  System.out.println("AMOUNT TO BE PAID"+sonyQuarterAmount);
		    	   break;
		    	case Y:
		    	  int sonyYearlyamount=800;
		    	  System.out.println("AMOUNT TO BE PAID"+sonyYearlyamount);
		    	  break;
		    	}                                   //switch4 close
		    	break;    //sony break
	    	}
           break;           //media break
	    	}                //entermaintement  switch close
         break;                  
		    
	   case VEDIOGAMES:
		   System.out.println(" VEDIOGAMES Module");
		    System.out.println("======================");
		    System.out.println("CRIC-to select cricket");
		    System.out.println("CHESS-to select chess");
		    System.out.println("MAIN-Return to Main Menu");
		    System.out.println("======================");
		    System.out.println("Enter your type of game (CRIC,CHESS,MAIN) : ");
		    module=br.nextLine();
	     switch(submodule4.valueOf(module))
	     {
	     case CRIC:
	    	    System.out.println("Menu \t Description  \t TYPES OF rent ");
		    	System.out.println("===============================================");
		    	System.out.println("H-hourly");
		    	System.out.println("");
		    	System.out.println("D-day_wise");
		    	System.out.println("");
		    	System.out.println("W-weekly");
		    	System.out.println("===============================================");
		    	System.out.println("Enter your type of rent(H,D,W,MAIN) : ");
		    	module=br.nextLine();
		    	switch(submodule6.valueOf(module))     //switch 4open cost
		    	{
		    	case H:
		    	  int cricHourlyAmount=20;
		    	  System.out.println("Enter number of hours");
		    		H_NO =Integer.parseInt( br.nextLine());
		    		System.out.println("you selected no of hours are "+H_NO+" "+"each hour cost"+20);
		    		cricHourlyAmount=cricHourlyAmount*H_NO;
		    		System.out.println("TOTAL AMOUNT"+cricHourlyAmount);
		    	  break;
		    	case D:
		    	  int cricDayAmount=100;
		    	  System.out.println("Enter number of days");
		    		D_NO =Integer.parseInt( br.nextLine());
		    		System.out.println("you selected no of hours are "+D_NO+" "+"each day cost"+100);
		    		cricDayAmount=cricDayAmount*D_NO;
		    		System.out.println("TOTAL AMOUNT"+cricDayAmount);
		    	   break;
		    	case W:
		    	  int cricWeekAmount=500;
		    	  System.out.println("Enter number of Weeks");
		    		H_NO =Integer.parseInt( br.nextLine());
		    		System.out.println("you selected no of weeks are "+W_NO+" "+"each week cost"+500);
		    		cricWeekAmount=cricWeekAmount*W_NO;
		    		System.out.println("TOTAL AMOUNT"+cricWeekAmount);
		    	  break;
		    	}                                   //switch4 close
		    	break;
	     case CHESS:
	    	    System.out.println("Menu \t Description  \t TYPES OF rent ");
		    	System.out.println("===============================================");
		    	System.out.println("H-monthly");
		    	System.out.println("");
		    	System.out.println("D-quertly");
		    	System.out.println("");
		    	System.out.println("W-yearly");
		    	System.out.println("===============================================");
		    	System.out.println("Enter your type of rent(H,D,W,MAIN) : ");
		    	module=br.nextLine();
		    	switch(submodule6.valueOf(module))     //switch 4open cost
		    	{
		    	case H:
		    	  int chessHourAmount=15;
		    	  System.out.println("Enter number of hours");
		    		H_NO =Integer.parseInt( br.nextLine());
		    		System.out.println("you selected no of hours are "+H_NO+" "+"each hour cost"+15);
		    		chessHourAmount=chessHourAmount*H_NO;
		    		System.out.println("TOTAL AMOUNT"+chessHourAmount);
		    	  break;
		    	case D:
		    	  int chessDayAmount=80;
		    	  System.out.println("Enter number of days");
		    		D_NO =Integer.parseInt( br.nextLine());
		    		System.out.println("you selected no of hours are "+D_NO+" "+"each day cost"+80);
		    		chessDayAmount=chessDayAmount*D_NO;
		    		System.out.println("TOTAL AMOUNT"+chessDayAmount);
		    	   break;
		    	case W:
		    	  int chessWeekAmount=400;
		    	  System.out.println("Enter number of Weeks");
		    		H_NO =Integer.parseInt( br.nextLine());
		    		System.out.println("you selected no of weeks are "+W_NO+" "+"each week cost"+400);
		    		chessWeekAmount=chessWeekAmount*W_NO;
		    		System.out.println("TOTAL AMOUNT"+chessWeekAmount);
		    	  break;
		    	}                                   //switch4 close
		    	break;        //vedio games break
	     }                 //vediogames close
		   break;          //last switch
	    	 
		    	}                                      //switch 3close
		    	
		    }                                          //switch 2close
		}                                           //switch 1close
	}                                                //while close


