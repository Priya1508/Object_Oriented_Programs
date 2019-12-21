package com.bridgelabz.stockmanagement.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.stockmanagement.model.StockDetails;
import com.bridgelabz.stockmanagement.repository.Controller;
import com.bridgelabz.stockmanagement.service.Operation;
import com.bridgelabz.stockmanagement.service.Utility;

public class StockManagement
{
	public static void main(String[] args) throws IOException 
	{
		//List<StockManagement> list=new LinkedList<>();
		Controller connection=new Controller();
		Operation operation=new Operation();
		do
		{
			System.out.println("Enter 1 to add stock");
			System.out.println("Enter 2 to remove stock");
			System.out.println("Enter 3 to calculate the total share");
			List<StockDetails> list1=new LinkedList<>();
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:
				//List<StockDetails> info=connection.readFile();
				List<StockDetails> stocklist=operation.addStock(list1);
				connection.writeFile(list1);
				break;
				
//			case 2:
//				List<StockDetails> info2=connection.readFile();
//				List<StockDetails> stocklist2=operation.removeStock(info);
//				connection.writeFile(stocklist2);
//				break;
//				
//			case 3:
//				List<StockDetails> info3=connection.readFile();
//				List<StockDetails> stocklist3=operation.totalShare(info);
//				break;
			}
		}while(Utility.inputBoolean());

	}

}
