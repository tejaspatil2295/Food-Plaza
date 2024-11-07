package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.CustomerDaoImp;
import com.pojo.Customers;
import com.pojo.Food;




public class CustomerTest {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long contact_no; String Customer_name, Email_id, pword, address; 
		
		CustomerDaoImp custObj = new CustomerDaoImp();
		List<Customers> l = new ArrayList<Customers>();
		
		
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
					System.out.println("Enter Customer Name: ");
					Customer_name=br.readLine();
					System.out.println("Enter Email id:  ");
					Email_id=br.readLine();
					System.out.println("Enter the password:  ");
					pword=br.readLine();
					System.out.println("Enter the Address: ");
					address=br.readLine();
					System.out.println("Enter contact number: ");
					contact_no=sc.nextLong();
					
					b = custObj.addCustomer(new Customers(Customer_name, Email_id, pword, address, contact_no));
					
					if(b)
					{
						System.out.println("Successful " +Customer_name);
					}
					else
					{
						System.out.println("failed ");
					}
				}
				break;
				
			case 2:
				System.out.println("Enter the email id you want to update: ");
				
				Email_id=br.readLine();
				System.out.println("Enter Customer name: ");
				Customer_name=br.readLine();
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
					
				}

	}
}
}



