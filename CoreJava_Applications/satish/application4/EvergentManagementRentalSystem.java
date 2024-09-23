package com.evergent.corejava.satish.application4;

import java.util.Scanner;
class EvergentManagementRentalSystem extends Evergent{
	String ceo;
	String headQuarters;
	
	EvergentManagementRentalSystem(String ceo,String headQuarters) 
	{
		super(ceo, headQuarters);
	}
	public void display()
	{
		System.out.println("Welcome to Evergent Technologies");
	}
    public static void main(String[] args) {
    	EvergentManagementRentalSystem ems=new EvergentManagementRentalSystem("VijaySajja","california");
    	ems.display();
    	ems.show();
    	System.out.println(fromyear);
    	Scanner sc=new Scanner(System.in);
    	enum module1  {AT,SINGTEL,AIRTEL};
    	enum module2  {BBC,AHA,SONY};
    	enum submodule1  {M,Q,Y};
    	enum module3{CHESS,CRIC};
    	enum submodule2{H,D,W};
    	Carrier1 c = new Carrier1();
    	Media1 m = new Media1();
    	 VGames vgo=new VGames();
    	System.out.println("Enter 1-Carriers,2-media,3-vedigames");
    	int num=sc.nextInt();
    	
    	switch(num)
    	{
    	case 1:
    	
    	System.out.println("Enter type of carrier in(AT,SINGTEL,AIRTEL)");
    	String ename=sc.next();
    	switch(module1.valueOf(ename))
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
	        System.out.println(c.getType());
	        System.out.println("Enter your type of subscription(M,Q,Y) : ");

	          String module=sc.next();
	          System.out.println("Enter the time period");
	          int timePeriod=sc.nextInt();
	    	switch(submodule1.valueOf(module))     //switch 4open cost
	    	{
	    	case M:
	    		 System.out.println("AMOUNT TO BE PAID");
	    	    
	    	     System.out.println(c.monthlyCost(timePeriod,75));
	    	  break;
	    	case Q:
	    		 System.out.println("AMOUNT TO BE PAID"+200);
	    		 System.out.println(c.quarterlyCost(timePeriod,200));
	    	   break;
	    	case Y:
	    		 System.out.println("AMOUNT TO BE PAID"+700);
	    		 System.out.println(c.yearlyCost(timePeriod,700));
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
	    	module=sc.next();
	    	System.out.println("Enter the time period");
	    	int timePeriod2=sc.nextInt();
	    	switch(submodule1.valueOf(module))     //switch 4open cost
	    	{
	    	case M:
	    	  System.out.println("AMOUNT TO BE PAID"+80);
	    	  System.out.println(c.monthlyCost(timePeriod2,80));
	    	  break;
	    	case Q:
	    		 System.out.println("AMOUNT TO BE PAID"+210);
	    		 System.out.println(c.quarterlyCost(timePeriod2,200));
	    	   break;
	    	case Y:
	    		 System.out.println("AMOUNT TO BE PAID"+740);
	    		 System.out.println(c.yearlyCost(timePeriod2,740));
	    	  break;
	    	}                                   //switch4 close
	    	break;
    	case AIRTEL:
    		System.out.println("Menu \t Description  \t TYPES OF subscription ");
	    	System.out.println("===============================================");
	    	System.out.println("M-monthly");
	    	System.out.println("");
	    	System.out.println("Q-quertly");
	    	System.out.println("");
	    	System.out.println("Y-yearly");
	    	System.out.println("===============================================");
	    	System.out.println("Enter your type of subscription(M,Q,Y) : ");
	    	module=sc.next();
	    	System.out.println("Enter the time period");
	    	int timePeriod3=sc.nextInt();
	    	switch(submodule1.valueOf(module))     //switch 4open cost
	    	{
	    	case M:
	    	 System.out.println("AMOUNT TO BE PAID"+60);
	    	 System.out.println(c.monthlyCost(timePeriod3,60));
	    	  break;
	    	case Q:
	    	  System.out.println("AMOUNT TO BE PAID"+150);
	    	  System.out.println(c.quarterlyCost(timePeriod3,150));
	    	   break;
	    	case Y:
	    	  System.out.println("AMOUNT TO BE PAID"+500);
	    	  System.out.println(c.yearlyCost(timePeriod3,500));
	    	  break;
	    	}                                   //switch4 close
	    	break;
    	}
    	break;
    	case 2:
         
         System.out.println("Enter the media type in BBC,AHA,SONY");
    	String mediatype=sc.next();
    	switch(module2.valueOf(mediatype))
    	{                                  //switch3open types of carriers
    	case BBC:
    		System.out.println("Menu \t Description  \t TYPES OF subscription ");
	    	System.out.println("===============================================");
	    	System.out.println("M-monthly");
	    	System.out.println("");
	    	System.out.println("Q-quarterly");
	    	System.out.println("");
	    	System.out.println("Y-yearly");
	    	System.out.println("===============================================");
	    	System.out.println(m.getType());
	    	System.out.println("Enter your type of subscription(M,Q,Y) : ");
	    	
	          String module=sc.next();
	          System.out.println("Enter the time period");
	          int timePeriod1=sc.nextInt();
	    	switch(submodule1.valueOf(module))     //switch 4open cost
	    	{
	    	case M:
	    		 System.out.println("AMOUNT TO BE PAID per month"+" "+75);
	    	    
	    	     System.out.println(m.monthlyCost(timePeriod1,75));
	    	  break;
	    	case Q:
	    		 System.out.println("AMOUNT TO BE PAID per quarter"+" "+125);
	    		 System.out.println(m.quarterlyCost(timePeriod1,200));
	    	   break;
	    	case Y:
	    		 System.out.println("AMOUNT TO BE PAID per year "+" "+450);
	    		 System.out.println(m.yearlyCost(timePeriod1,700));
	    	  break;
	    	}                                   //switch4 close
	    	break;
    	case AHA:
    		System.out.println("Menu \t Description  \t TYPES OF subscription ");
	    	System.out.println("===============================================");
	    	System.out.println("M-monthly");
	    	System.out.println("");
	    	System.out.println("Q-quarterly");
	    	System.out.println("");
	    	System.out.println("Y-yearly");
	    	System.out.println("===============================================");
	    	System.out.println("Enter your type of subscription(M,Q,Y) : ");
	    	
	    	module=sc.next();
	    	System.out.println("Enter the time period");
	    	int timePeriod2=sc.nextInt();
	    	switch(submodule1.valueOf(module))     //switch 4open cost
	    	{
	    	case M:
	    	  System.out.println("AMOUNT TO BE PAID per month   "+80);
	    	  System.out.println(m.monthlyCost(timePeriod2,80));
	    	  break;
	    	case Q:
	    		 System.out.println("AMOUNT TO BE PAID per quarter  "+220);
	    		 System.out.println(m.quarterlyCost(timePeriod2,200));
	    	   break;
	    	case Y:
	    		 System.out.println("AMOUNT TO BE PAID per year  "+800);
	    		 System.out.println(m.yearlyCost(timePeriod2,740));
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
	    	module=sc.next();
	    	System.out.println("Enter time period");
	    	int timePeriod3=sc.nextInt();
	    	switch(submodule1.valueOf(module))     //switch 4open cost
	    	{
	    	case M:
	    	 System.out.println("AMOUNT TO BE PAID per month  "+60);
	    	 System.out.println(m.monthlyCost(timePeriod3,60));
	    	  break;
	    	case Q:
	    	  System.out.println("AMOUNT TO BE PAID per quarter  "+150);
	    	  System.out.println(m.quarterlyCost(timePeriod3,150));
	    	   break;
	    	case Y:
	    	  System.out.println("AMOUNT TO BE PAID per year  "+500);
	    	  System.out.println(m.yearlyCost(timePeriod3,500));
	    	  break;
	    	}                                   //switch4 close
	    	break;
    	}
        break;
    	case 3:
       
        System.out.println("Enter Game name in(CRIC,CHESS)");
    	String vg=sc.next();
	     switch(module3.valueOf(vg))
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
		    	String tp=sc.next();
		    	switch(submodule2.valueOf(tp))     //switch 4open cost
		    	{
		    	case H:
		    	  int cricHourlyAmount=20;
		    	  System.out.println("Enter number of hours");
		    		int H_NO =Integer.parseInt( sc.next());
		    		System.out.println("you selected no of hours are "+H_NO+" "+"each hour cost"+20);
		    		System.out.println("TOTAL AMOUNT"+vgo.hourlyCost(H_NO,cricHourlyAmount));
		    	  break;
		    	case D:
		    	  int cricDayAmount=100;
		    	  System.out.println("Enter number of days");
		    		int D_NO =Integer.parseInt( sc.next());
		    		System.out.println("you selected no of hours are "+D_NO+" "+"each day cost"+100);
		    		System.out.println("TOTAL AMOUNT"+vgo.day_wiseCost(D_NO,cricDayAmount));
		    	   break;
		    	case W:
		    	  int cricWeekAmount=500;
		    	  System.out.println("Enter number of Weeks");
		    		int W_NO =Integer.parseInt( sc.next());
		    		System.out.println("you selected no of weeks are "+W_NO+" "+"each week cost"+500);
		    		
		    		System.out.println("TOTAL AMOUNT"+vgo.weeklyCost(W_NO,cricWeekAmount));
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
		    	String tp2=sc.next();
		    	switch(submodule2.valueOf(tp2))     //switch 4open cost
		    	{
		    	case H:
		    	  int chessHourAmount=15;
		    	  System.out.println("Enter number of hours");
		    		int H_NO =Integer.parseInt( sc.next());
		    		System.out.println("you selected no of hours are  "+H_NO+" "+"each hour cost  "+15);
		    		System.out.println("TOTAL AMOUNT"+vgo.hourlyCost(H_NO,chessHourAmount));
		    	  break;
		    	case D:
		    	  int chessDayAmount=80;
		    	  System.out.println("Enter number of days");
		    		int D_NO =Integer.parseInt( sc.next());
		    		System.out.println("you selected no of hours are "+D_NO+" "+"each day cost  "+80);
		    		
		    		System.out.println("TOTAL AMOUNT"+vgo.day_wiseCost(D_NO,chessDayAmount));
		    	   break;
		    	case W:
		    	  int chessWeekAmount=400;
		    	  System.out.println("Enter number of Weeks");
		    		int W_NO =Integer.parseInt( sc.next());
		    		System.out.println("you selected no of weeks are "+W_NO+" "+"each week cost  "+400);
		    		System.out.println("TOTAL AMOUNT"+vgo.weeklyCost(W_NO,chessWeekAmount));
		    	  break;
		    	}                                   //switch4 close
		    	break;        //vedio games break
	     }    
	     break;
    	}//vediogames close
        //last switch
	    	 
        
    }
}