package com.bridgelabz.stockmanagement.service;

import java.util.List;

import com.bridgelabz.stockmanagement.model.StockDetails;

public class Operation 
{
	StockDetails detail=new StockDetails();
	//ADD STOCK
	public List<StockDetails> addStock(List<StockDetails> stocklist)
	{
		do
		{
			System.out.println("Enter the name of the stock");
			String name=Utility.inputString();
			detail.setName(name);
			System.out.println("Enter the number of shares");
			int share=Utility.inputInteger();
		    detail.setNumOfShare(share);
			System.out.println("Enter the price of the share");
			float price=Utility.inputFloat();
			detail.setSharePrice(price);
			stocklist.add(detail);
			System.out.println("Stock details added successfully");
			System.out.println("To add more stock type TRUE");
			return stocklist;
		}while(Utility.inputBoolean());	
	}
	
	//REMOVE STOCK
	public List<StockDetails> removeStock(List<StockDetails> stocklist)
	{
		do
		{
			System.out.println("Enter the stock name you want to remove");
			String name=Utility.inputString();
			detail.getName();
			for(int i=0;i<stocklist.size();i++)
			{
				if(stocklist.get(i).getName().equals(name))
				{
					stocklist.remove(stocklist.get(i));
					System.out.println("Stock removed successfully");
					System.out.println("To remove more stock type true");
				}
			}
			return stocklist;
		}while(Utility.inputBoolean());
	}
	//TO CALCULATE TOTAL SHARE
	public List<StockDetails> totalShare(List<StockDetails> stocklist)
	{
		do
		{
		  System.out.println("Enter the name of the stock that you want to calculate the total stock");
		  String name=Utility.inputString();
		  detail.getName();
		  for(int i=0;i<stocklist.size();i++)
		  {
			if(stocklist.get(i).getName().equals(name))
			  {
				float totalShare=(stocklist.get(i).getNumOfShare() * stocklist.get(i).getSharePrice());
				System.out.println("Total share of the stock is: "+totalShare);
				System.out.println("To calculate more stock type true");
			  }
		  }
		  return stocklist;
	    }while(Utility.inputBoolean());
	}
	//TO CALCULATER TOTAL SHARE PRICE IN MARKET
	public List<StockDetails> totalShareMar(List<StockDetails> stocklist)
	{
		System.out.println("Total share in the market is: ");
		float temp=0;
		for(int i=0;i<stocklist.size();i++)
		{
			float totalShare1=(stocklist.get(i).getSharePrice() * stocklist.get(i).getNumOfShare());
			temp=temp+totalShare1;
		}
		System.out.println(temp+" ");
		return stocklist;
	}
	

}
