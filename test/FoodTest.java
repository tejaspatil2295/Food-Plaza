package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dao.FoodDaoImp;
import com.pojo.Food;

public class FoodTest {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int food_id, food_quantity; String food_name, food_type; float food_price;
		
		FoodDaoImp foodObj = new FoodDaoImp();
		List<Food> l = new ArrayList<Food>();
		
		while(true)
		{
			System.out.println("1.add\n2.Update\n3.Delete\n4.search\n5.showAllData");
			System.out.println("Enter the choice: ");
			int choice = sc.nextInt();
			
			boolean b;
			switch(choice)
			{
			case 1:
				
				System.out.println("how many data you want to add : ");
				int num = sc.nextInt();
				
				for(int i=1; i<=num;i++) {
					System.out.println("Enter the food name: ");
					food_name=br.readLine();
					System.out.println("Enter the food type: ");
					food_type=br.readLine();
					System.out.println("Enter the food quantity: ");
					food_quantity=sc.nextInt();
					System.out.println("Enter the food price: ");
					float price =sc.nextFloat();
					food_price= food_quantity*price;
					
					b = foodObj.addFood(new Food(food_name, food_type, food_quantity, food_price));
					
					if(b)
					{
						System.out.println("Successful "+food_name);
					}
					else
					{
						System.out.println("failed ");
					}
				}
				break;
				
			case 2 :
				System.out.println("Enter food id: ");
				food_id = sc.nextInt();
				System.out.println("Enter food name: ");
				food_name=br.readLine();
				System.out.println("Enter the food type: ");
				food_type=br.readLine();
				System.out.println("Enter the food quantity: ");
				food_quantity=sc.nextInt();
				System.out.println("Enter the food price: ");
				food_price=sc.nextFloat();
				Food food = new Food(food_name,food_type,food_quantity,food_price);
				food.setFood_id(food_id);
				
				b = foodObj.updateFoodById(food);
				
				if(b)
				{
					System.out.println("Updated successfully");
				}
				else
				{
					System.out.println("Failed to update");
				}
				break;
				
			case 3:
				System.out.println("Enter food id: ");
				food_id=sc.nextInt();
				
				b= foodObj.deleteFoodById(food_id);
				
				if(b)
				{
					System.out.println("Deleted successfully");
				}
				else {
					System.out.println("Failed to delete");
				}
				break;
				
			case 4:
				System.out.println("Enter the food id for search: ");
				food_id=sc.nextInt();
				
				Food food1 = new Food();
				food1 = foodObj.searchFoodById(food_id);
				
				if(food1!=null)
				{
					System.out.println(food1);
				
				}else {
					System.out.println("Not available");
				}
				break;
				
			case 5:
				System.out.println("Show all data");
				
				l = foodObj.getAllFood();
				
				Iterator<Food>it = l.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				break;
				
				
				
				
				
			}
		}
	}

}
