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
			System.out.println("Stock details added successfully");
			System.out.println("To add more stock type TRUE");
			return stocklist;
		}while(Utility.inputBoolean());	
	}

}
