package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Food;
import com.utility.DataConnect;

public class FoodDaoImp implements FoodDao
{

	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	@Override
	public boolean addFood(Food food) {
		try 
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("insert into Food (food_name, food_type, food_quantity, food_price) values(?, ?, ?, ?)");
			ps.setString(1, food.getFood_name());
			ps.setString(2, food.getFood_type());
			ps.setInt(3, food.getFood_quantity());
			ps.setFloat(4, food.getFood_price());
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
	public boolean updateFoodById(Food food) {
		try 
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("update Food set food_name=?, food_type=?, food_quantity=?, food_price=? where food_id=?");
			ps.setString(1, food.getFood_name());
			ps.setString(2, food.getFood_type());
			ps.setInt(3, food.getFood_quantity());
			ps.setFloat(4, food.getFood_price());
			ps.setInt(5, food.getFood_id());
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
	public boolean deleteFoodById(int food_id) {
		try 
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("delete from Food where food_id=?");
			
			
			ps.setInt(1, food_id);
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
	public List<Food> getAllFood() {
		List<Food>l=new ArrayList<Food>();
		try
		{
			con=DataConnect.getConnect();
			ps=con.prepareStatement("select * from Food");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				Food food = new Food();
				food.setFood_id(rs.getInt("food_id"));
				food.setFood_name(rs.getString("food_name"));
				food.setFood_type(rs.getString("food_type"));
				food.setFood_quantity(rs.getInt("food_quantity"));
				food.setFood_price(rs.getFloat("food_price"));
				
				l.add(food);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public Food searchFoodById(int foodId) {
		Food food = null;
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("select * from Food where food_id=?");
			ps.setInt(1, foodId);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				food = new Food();
				food.setFood_name(rs.getString("food_name"));
				food.setFood_id(rs.getInt("food_id"));
				food.setFood_quantity(rs.getInt("food_quantity"));
				food.setFood_type(rs.getString("food_type"));
				food.setFood_price(rs.getFloat("food_price"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return food;
	}


}
