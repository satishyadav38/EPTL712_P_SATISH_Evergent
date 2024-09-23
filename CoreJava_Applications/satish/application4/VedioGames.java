package com.evergent.corejava.satish.application4;


interface VedioGames extends EntertainmentComponent
{
	public int hourlyCost(int h,int hCost);
	public int day_wiseCost(int d ,int dCost);
	public int weeklyCost(int w,int wCost);
}