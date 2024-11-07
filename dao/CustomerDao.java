package com.dao;

import java.util.List;

import com.pojo.Customers;


public interface CustomerDao {
	boolean addCustomer(Customers cust);
	boolean updateCustomerById(Customers cust);
	boolean deleteCustomerById(Customers Email_id);
	Customers searchCustomerById(Customers Email_id);
	List<Customers>getAllCustomers();
}
