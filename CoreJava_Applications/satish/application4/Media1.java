package com.evergent.corejava.satish.application4;

class Media1  implements Entertainment {
	String mediaName;
    int mediaCost;

    

    @Override
    public String getType() {
        return mediaName;
    }
    public int monthlyCost(int months,int monthCost)
    {
    	mediaCost=months*monthCost;
    	return mediaCost;
    }
    public int quarterlyCost(int quats,int quatsCost)
    {
    	mediaCost=quats*quatsCost;
    	return mediaCost;
    }
    public int yearlyCost(int years,int yearlyCost)
    {
    	mediaCost=years*yearlyCost;
    	return mediaCost;
    }
	
}