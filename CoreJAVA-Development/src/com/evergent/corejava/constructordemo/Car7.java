package com.evergent.corejava.constructordemo;
public class Car7 {
	String color;
	int maxspeed;
	Car7(){
	 	color="white";
		 maxspeed=120;
	}
	Car7(String color,int maxspeed){
		this.color=color;
		this.maxspeed=maxspeed;
	}
	void display() {
		System.out.println("Color :"+color);
		System.out.println("MaxSpeed:"+maxspeed);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car7 c7=new Car7("Red",150);
		Car7 c77=new Car7();
		c7.display();
		c77.display();

	}

}
//In this Program We Initailized variables in Default Constructor