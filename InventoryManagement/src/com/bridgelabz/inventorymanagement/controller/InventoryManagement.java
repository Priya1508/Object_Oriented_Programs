package com.bridgelabz.inventorymanagement.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.inventorymanagement.model.Details;
import com.bridgelabz.inventorymanagement.repository.Controller;
import com.bridgelabz.inventorymanagement.service.Operation;
import com.bridgelabz.inventorymanagement.service.Utility;

public class InventoryManagement 
{
	public static void main(String[] args) throws  IOException
	{
		List<InventoryManagement> list=new LinkedList<>();
		Controller connection= new Controller();
		Operation operation=new Operation();
		do
		{
			System.out.println("Enter your chooice");
			System.out.println();
			System.out.println("Enter 1 to add Inventory");
			System.out.println("Enter 2 to remove Inventory");
			System.out.println("Enter 3 to calculate the total price of the Inventory");
		//	List<Details> list1 = new LinkedList<>();
			int choice=Utility.inputInteger();
			switch(choice)
			{
			
			   case 1: 
				   List<Details> info=connection.readFile();
				   List<Details>detaillist=operation.addInventory(info);
				   connection.writeFile(detaillist);
				   break;
				   
			   case 2: 
				   List<Details> info1=connection.readFile();
				   List<Details>detaillist1=operation.removeInventory(info1);
				   connection.writeFile(detaillist1);
				   break;
				  
			   case 3:
				   List<Details> info2=connection.readFile();
				   List<Details>detaillist2=operation.totalPrice(info2);
				   connection.writeFile(detaillist2);
				   break;
			}
		}while(Utility.inputBoolean());
	}
}
