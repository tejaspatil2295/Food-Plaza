package com.pojo;

public class Orders {
	private int Order_id;
	private String Email_id;
	private float total_price;
	public Orders() {
		super();
	}
	public Orders(int order_id, String email_id, float total_price) {
		super();
		Order_id = order_id;
		Email_id = email_id;
		this.total_price = total_price;
	}
	public int getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(int order_id) {
		Order_id = order_id;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	public float getTotal_price() {
		return total_price;
	}
	public void setTotal_price(float total_price) {
		this.total_price = total_price;
	}
	@Override
	public String toString() {
		return "Orders [Order_id=" + Order_id + ", Email_id=" + Email_id + ", total_price=" + total_price + "]";
	}
	
}
