package com.bridgelabz.inventorymanagement.service;

import java.util.List;

import com.bridgelabz.inventorymanagement.model.Details;

public class Operation
{
	Details detail=new Details();
	//TO ADD INVENTORY
	public List<Details> addInventory(List<Details> listOfInventory)
	{
		do
		{
			
			System.out.println("Enter 1 to add inventory");
			System.out.println("Enter 2 to add inventory");
			System.out.println("Enter 3 to add inventory");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the name of Inventory ");
				String invenName=Utility.inputString();
				detail.setName(invenName);
				System.out.println("Enter how much kg of rice you want to add");
				detail.setWeight(Utility.inputLong());
				listOfInventory.add(detail);
				System.out.println("Inventory added successfully");
				System.out.println("To add more inventory type TRUE");
				break;
				
			case 2:
				
				System.out.println("Enter how much kg of pulse you want to add");
				detail.setWeight(Utility.inputLong());
				listOfInventory.add(detail);
				System.out.println("Inventory added successfully");
				System.out.println("To add more inventory type TRUe");
				break;
				
			case 3:
				System.out.println("Enter how much kg of wheat you want to add");
				detail.setWeight(Utility.inputLong());
				listOfInventory.add(detail);
				System.out.println("Inventory added successfully");
				System.out.println("To add more inventory type TRUE");
				break;
			}
			return listOfInventory;
		}while(Utility.inputBoolean());
	}
	//TO REMOVE INVENTORY
	public List<Details> removeInventory(List<Details> listOfInventory)
	{
		do
		{
			System.out.println("Enter the name of the inventory you want to remove");
			String name=Utility.inputString();
				for(int i=0;i<listOfInventory.size();i++)
				{
					if(listOfInventory.get(i).getName().equals(name))
					{
						listOfInventory.remove(listOfInventory.get(i));
						System.out.println("inventory removed successfully");
						System.out.println("To remove more inventory type TRUE");
					}
				}
			return listOfInventory;
    	}while(Utility.inputBoolean());
	}
	//TO CALCULATE THE TOTAL PRICE OF THE INVENTORY
	public List<Details> totalPrice(List<Details> listOfDetails)
	{
		do
		{
			System.out.println("Enter the the inventory that you want to calculate the total price");
			String inventName=Utility.inputString();
			String name=detail.getName();
			for(int i=0;i<listOfDetails.size();i++)
			{
				if(listOfDetails.get(i).getName().equals(inventName))
				{
					float totalPrice=(listOfDetails.get(i).getPriceperkg()*listOfDetails.get(i).getWeight());
					System.out.println("Total price is "+totalPrice);
					System.out.println("To calculate more inventory price type TRUE");
				}
			}
			return listOfDetails;
		}while(Utility.inputBoolean());
	}
}
