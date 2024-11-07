package com.pojo;

public class cart {
	private int cart_Id;
	private int food_id;
	private int quantity;
	private String Email_id;
	private String foodName;
	private float price;
	private float totalprice;
	public cart() {
		super();
	}
	public cart(int cart_Id, int food_id, int quantity, String email_id, String foodName, float price,
			float totalprice) {
		super();
		this.cart_Id = cart_Id;
		this.food_id = food_id;
		this.quantity = quantity;
		Email_id = email_id;
		this.foodName = foodName;
		this.price = price;
		this.totalprice = totalprice;
	}
	public int getCart_Id() {
		return cart_Id;
	}
	public void setCart_Id(int cart_Id) {
		this.cart_Id = cart_Id;
	}
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "cart [cart_Id=" + cart_Id + ", food_id=" + food_id + ", quantity=" + quantity + ", Email_id=" + Email_id
				+ ", foodName=" + foodName + ", price=" + price + ", totalprice=" + totalprice + "]";
	}
}
