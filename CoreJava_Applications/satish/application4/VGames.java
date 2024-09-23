package com.evergent.corejava.satish.application4;

class VGames implements VedioGames{
	String gameName;
	int gCost;
	 public String getType() {
	        return gameName;
	    }
	 public int hourlyCost(int h,int hCost)
	    {
	    	gCost=h*hCost;
	    	return gCost;
	    }
	 public int day_wiseCost(int d ,int dCost)
	    {
	    	gCost=d*dCost;
	    	return gCost;
	    }
	    public int weeklyCost(int w,int wCost)
	    {
	    	gCost=w*wCost;
	    	return gCost;
	    }
		
	    
}