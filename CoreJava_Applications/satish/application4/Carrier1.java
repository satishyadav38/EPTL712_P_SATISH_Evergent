package com.evergent.corejava.satish.application4;

class Carrier1  implements Entertainment {
    String carrierName;
   int carrierCost;

   /*public Carrier(String carrierName) {
       this.carrierName = carrierName;
       //this.carrierCost = carrierCost;
   }*/

   @Override
   
   public String getType() {
       return carrierName;
   }
   public int monthlyCost(int months,int monthCost)
   {
   	carrierCost=months*monthCost;
   	return carrierCost;
   }
   public int quarterlyCost(int quats,int quatsCost)
   {
   	carrierCost=quats*quatsCost;
   	return carrierCost;
   }
   public int yearlyCost(int years,int yearlyCost)
   {
   	carrierCost=years*yearlyCost;
   	return carrierCost;
   }
	
}




