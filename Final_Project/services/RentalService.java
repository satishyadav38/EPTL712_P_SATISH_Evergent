package com.capg.farmequipment.satish.services;

import com.capg.farmequipment.satish.bean.FarmEquipmentBean;
import com.capg.farmequipment.satish.dao.FarmEquipmentDAO;

public class RentalService {
	String str="";
	FarmEquipmentDAO farmequipmentDAO=new FarmEquipmentDAO();
	public int createAccount(int customerId,String farmerName,long mobileNumber,double balance)
	{
		FarmEquipmentBean  farmEquipmentBean=new FarmEquipmentBean();
		farmEquipmentBean.setCustomerId(customerId);
		//farmEquipmentBean.setEquipId(equipId);
		farmEquipmentBean.setFarmerName(farmerName);
		farmEquipmentBean.setBalance(balance);
		farmEquipmentBean.setMobileNumber(mobileNumber);
		//farmEquipmentBean.setRentTimeInMonths(months);
		int re=farmequipmentDAO.createAcc(farmEquipmentBean);
		if(re!=0) {
		str="You Created An Account with customer id";
		//farmequipmentDAO.addTran(customerId,str);}
		return re;
		}
		return re;
	}
	public double showBalance(int accno)
	{
		return farmequipmentDAO.showB(accno);
	}
	public double deposite(int accno,double money)
	{
		double beforeBalance=farmequipmentDAO.showB(accno);
		int a=farmequipmentDAO.dep(accno,money+beforeBalance);
		double balance=farmequipmentDAO.showB(accno);
		str="You Deposited: "+money;
		//farmequipmentDAO.addTran(accno,str);
		return balance;
	}
	public int withdraw(int customerId,double money)
	{
		double curBalance=farmequipmentDAO.showB(customerId);
		if(money>curBalance)
		{
			return 0;
		}
		else {
			int rs=farmequipmentDAO.with(customerId,curBalance-money);
			str="You Withdraw: "+money;
			//farmequipmentDAO.addTran(customerId,str);
			return rs;
		}
	}
	public int ftrans(int customerId,int equipId,double tAmount)
	{
		double myBalance=farmequipmentDAO.showB(customerId);
		if(myBalance<tAmount)
		{
			return 0;
		}
		else {
			int a=farmequipmentDAO.with(customerId,myBalance-tAmount);
			double toBalance=farmequipmentDAO.showB(customerId);
			int b=farmequipmentDAO.dep(customerId,tAmount-toBalance);
			str="You rented equips cost of: "+tAmount;
			//farmequipmentDAO.addTran(customerId,str);
			return b;
		}
		
	}
	
	public String getTransaction(int accno)
	{
		String tran=farmequipmentDAO.getTrans(accno);
		return tran;
	}
}
