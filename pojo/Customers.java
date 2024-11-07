package com.pojo;

public class Customers {
	
	private String Customer_name;
	private String Email_id;
	private String pword;
	private String address;
	private long contact_no;
	public Customers() {
		super();
	}
	public Customers(String customer_name, String email_id, String pword, String address, long contact_no) {
		super();
		Customer_name = customer_name;
		Email_id = email_id;
		this.pword = pword;
		this.address = address;
		this.contact_no = contact_no;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	@Override
	public String toString() {
		return "Customers [Customer_name=" + Customer_name + ", Email_id=" + Email_id + ", pword=" + pword
				+ ", address=" + address + ", contact_no=" + contact_no + "]";
	}

}
