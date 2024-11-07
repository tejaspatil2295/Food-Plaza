package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.pojo.Customers;
import com.utility.DataConnect;

public class CustomerDaoImp implements CustomerDao{
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	@Override
	public boolean addCustomer(Customers cust) {
		try 
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("insert into Customers (Customer_name, Email_id, pword, address, contact_no) values(?, ?, ?, ?,?)");
			ps.setString(1, cust.getCustomer_name());
			ps.setString(2, cust.getEmail_id());
			ps.setString(3, cust.getPword());
			ps.setString(4, cust.getAddress());
			ps.setLong(5, cust.getContact_no());
			int row = ps.executeUpdate();
			
			if(row>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateCustomerById(Customers cust) {
		try 
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("update Food set Customer_name=?, pword=?, address=?, contact_no=? where Email_id=?");
			ps.setString(1, cust.getCustomer_name());
			ps.setString(2, cust.getPword());
			ps.setString(3, cust.getAddress());
			ps.setLong(4, cust.getContact_no());
			ps.setString(5, cust.getEmail_id());
			int row = ps.executeUpdate();
			
			if(row>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCustomerById(Customers Email_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customers searchCustomerById(Customers Email_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
