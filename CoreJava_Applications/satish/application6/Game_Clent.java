package com.evergent.corejava.satish.application6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Game_Clent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GameInterface game =new GameImp();
		for(;;){
			System.out.println("1. Add Game 2.Search by game id 3.displayAll 4. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the id");
				   String id=sc.next();
				   System.out.println("Enter the game name");
				   String name=sc.next();
				   System.out.println("Enter the price of the game");
				   int price=sc.nextInt();
				   Game g=new Game();
				   g.setId(id);
				   g.setGameName(name);
				   g.setPrice(price);
				   String message=game.addGame(g);
				   System.out.println(message);
				   break;
			case 2:System.out.println("Enter the id");
			   	   String isb=sc.next();
			   	   game.searchByID(isb);
			   	   break;
			  			
			case 3:game.getAllGame();
				break;
			case 4:System.exit(0);
			}
			
		}
	}
}
	
