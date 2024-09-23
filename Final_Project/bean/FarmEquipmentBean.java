package com.capg.farmequipment.satish.bean;

public class FarmEquipmentBean {
	
	private int customerId;
//private int equipId;
private String farmerName;
private long mobileNumber;
//private double rentPeriodInMonths;
private double balance;

public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
//public int getEquipId() {
//	return equipId;
//}
//public void setEquipId(int equipId) {
//	this.equipId = equipId;
//}
public String getFarmerName() {
	return farmerName;
}
public void setFarmerName(String farmerName) {
	this.farmerName = farmerName;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
//public double getRentPeriodInMonths() {
//	return rentPeriodInMonths;
//}
//public void setRentTimeInMonths(double rentPeriodInMonths) {
//	this.rentPeriodInMonths = rentPeriodInMonths;
//}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
}