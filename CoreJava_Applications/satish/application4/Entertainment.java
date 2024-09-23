package com.evergent.corejava.satish.application4;

interface Entertainment extends EntertainmentComponent {
	public int monthlyCost(int months,int monthCost);
	public int quarterlyCost(int quats,int quatsCost);
	public int yearlyCost(int years,int yearlyCost);
}
