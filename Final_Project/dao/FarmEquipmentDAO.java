package com.capg.farmequipment.satish.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.capg.farmequipment.satish.bean.FarmEquipmentBean;
//import com.capg.shadow.bean.BankBean;


public class FarmEquipmentDAO {

	Connection con=null;
	PreparedStatement pstmt=null;
	public int createAcc(FarmEquipmentBean farmEquipmentBean)
	{
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  	{
			  con=RentalDBConnection.getConnection(); 
			  
			  String ins_str ="insert into FarmEquipment values(?,?,?,?)";
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,farmEquipmentBean.getCustomerId());
			 // pstmt.setInt(1,farmEquipmentBean.getEquipId());
			  pstmt.setString(2,farmEquipmentBean.getFarmerName());
			  pstmt.setLong(3, farmEquipmentBean.getMobileNumber());
			  //pstmt.setDouble(1,farmEquipmentBean.getRentPeriodInMonths());
			  pstmt.setDouble(4,farmEquipmentBean.getBalance());
			  int updateCount = pstmt.executeUpdate();
			  con.close();
			  return updateCount;
		  	}
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }  
	}
	public double showB(int customerId)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			double balance=0;
			con=RentalDBConnection.getConnection();
			String ins_str="select balance from FarmEquipment where customerId=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setInt(1, (int) customerId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				{
					balance=rs.getDouble(1);
				}
			con.close();
			return balance;
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return 0;
		}
		
	}
	public int dep(int customerId,double money)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=RentalDBConnection.getConnection();
			String ins_str="update FarmEquipment set balance=? where customerId=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setInt(2,  customerId);
			pstmt.setDouble(1, money);
			int rs=pstmt.executeUpdate();
			con.close();
			return rs;
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return 0;
		}
	}
	
	public int with(int customerId,double money)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=RentalDBConnection.getConnection();
			String ins_str="update FarmEquipment set balance=? where customerId=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setInt(2,  customerId);
			pstmt.setDouble(1, money);
			int rs=pstmt.executeUpdate();
			con.close();
			return rs;
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return 0;
		}
	}
	
	public String getTrans(int accno)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			String trann="";
			con=RentalDBConnection.getConnection();
			String ins_str="select transaction from transactions where customerId=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setInt(1, accno);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				{
					trann+=rs.getString(1)+"\n";
				}
			con.close();
			return trann;
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return "0";
		}
	}
	
//	public void addTran(int customerId,String tran)
//	{
//	Connection con=null;
//	PreparedStatement pstmt=null;
//	
//		  try
//		  	{
//			  con=RentalDBConnection.getConnection(); 
//			  
//			  String ins_str ="insert into transactions values(?,?)";
//			  pstmt = con.prepareStatement(ins_str);
//			  pstmt.setInt(1,customerId);
//			  pstmt.setString(2,tran);
//			  pstmt.executeUpdate();
//			  con.close();
//		  	}
//		  catch(Exception ex)
//		  {
//			  System.out.println(ex.toString());
//		  }  
//	
//	}
}
