package com.evergent.corejava.satish.application4;

abstract class Evergent{
	static int fromyear=2007;
	String ceo;
	String headQuarters;
	public Evergent(String ceo,String headQuarters) {
		this.ceo=ceo;
		this.headQuarters=headQuarters;
	}
	abstract public void display();
	public  void show()
	{
		System.out.println("Evergent Technlogie was founded by  "+ceo+" "+"and headquarters in  "+headQuarters);
		System.out.println("Evergent providing subscription and rental services since");
	}
	
}