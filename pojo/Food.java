package com.pojo;

public class Food {
	
	private int food_id;
	private String food_name;
	private String food_type;
	private int food_quantity;
	private float food_price;
	public Food() {
		super();
	}
	public Food( String food_name, String food_type, int food_quantity, float food_price) {
		super();
		
		this.food_name = food_name;
		this.food_type = food_type;
		this.food_quantity = food_quantity;
		this.food_price = food_price;
	}
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public String getFood_type() {
		return food_type;
	}
	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}
	public int getFood_quantity() {
		return food_quantity;
	}
	public void setFood_quantity(int food_quantity) {
		this.food_quantity = food_quantity;
	}
	public float getFood_price() {
		return food_price;
	}
	public void setFood_price(float food_price) {
		this.food_price = food_price;
	}
	@Override
	public String toString() {
		return "Food [food_id=" + food_id + ", food_name=" + food_name + ", food_type=" + food_type + ", food_quantity="
				+ food_quantity + ", food_price=" + food_price + "]";
	}

}
