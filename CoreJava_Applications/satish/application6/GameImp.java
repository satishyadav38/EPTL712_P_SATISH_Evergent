package com.evergent.corejava.satish.application6;

import java.util.HashSet;
import java.util.Set;

public class GameImp implements GameInterface {
	Set<Game> gameSet=null;
	public GameImp() {
		gameSet=new HashSet<Game>();
	}
	
	@Override
	public String addGame(Game g) {
		gameSet.add(g);
		return g.getId();
	} 

	@Override
	public void searchByID(String id) {
		boolean g=false;
		if(gameSet.size()>0 && gameSet!=null){
			for(Game game:gameSet){
				if(game.getId().equals(id)){
					System.out.println(game.getId()+" "+game.getGameName()+" "+game.getPrice());	
					g=true;
					break;	
				}
			}
		}
		if(!g)
			System.out.println("The book is not found");
			
	}

	@Override
	public void  getAllGame() {
			if(gameSet.size()>0){
				for(Game game:gameSet){
					System.out.println(game.getId()+" "+game.getGameName()+" "+game.getPrice());
				}
					
			}else{
				System.out.println("No books are available");
			}
	}

}
