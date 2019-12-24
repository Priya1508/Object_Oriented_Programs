package com.bridgelabz.commercialdataprocessing.service;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.commercialdataprocessing.model.CompanyDetails;
import com.bridgelabz.commercialdataprocessing.model.CustomerDetails;
import com.bridgelabz.commercialdataprocessing.repository.Controller;

public class Operation
{
	CompanyDetails company=new CompanyDetails();
	CustomerDetails customer=new CustomerDetails();
	
	//TO ADD COMAPNY DETAILS
	public List<CompanyDetails> addCompany(List<CompanyDetails> companylist) 
	{
		do
		{
			System.out.println("Enter the name of the company");
			String name=Utility.inputString();
			company.setCompanyName(name);
			System.out.println("Enter the shares of the company");
			int share=Utility.inputInteger();
			company.setNumbOfShare(share);
			System.out.println("Enter the price of the shares");
			float price=Utility.inputFloat();
			company.setSharePrice(price);
			companylist.add(company);
			System.out.println("Company details addeed successfully");
			System.out.println("To add more details type TRUE");
			return companylist;
		}while(Utility.inputBoolean());
	}
	
	//TO ADD CUSTOMER DETAILS
	public List<CustomerDetails> addCustomer(List<CustomerDetails> customerlist)
	{
		do
		{
			System.out.println("Enter the name of the customer");
			String name=Utility.inputString();
			customer.setCustomerName(name);;
			System.out.println("Enter the shares of the customer");
			int share=Utility.inputInteger();
			customer.setNumOfShare(share);
			System.out.println("Enter the price of the share");
			float price=Utility.inputFloat();
			customer.setShareprice(price);
			customerlist.add(customer);
			System.out.println("Customer details added successfully");
			System.out.println("To add morer details type TRUE");
			return customerlist;
		}while(Utility.inputBoolean());
	}
	
	//TO SELL SHARES
	public List<CustomerDetails> sellShare(List<CompanyDetails> companylist, List<CustomerDetails> customerlist) throws IOException
	{
		Controller connection=new Controller();
		do
		{
			System.out.println("Enter the company you want to sell share from");
			String compName=Utility.inputString();
			
			for(int i=0;i<companylist.size();i++)
			{
				if(companylist.get(i).getCompanyName().equals(compName))
				{
					System.out.println("Enter the name of the customer you want to sell");
					String custName=Utility.inputString();
					for(int j=0;j<customerlist.size();j++)
					{
						if(customerlist.get(j).getCustomerName().equals(custName))
						{
							System.out.println("Enter the number of share you want to sell");
							int share=Utility.inputInteger();
							System.out.println(share);
							int share1=customerlist.get(j).getNumOfShare()+share;
							System.out.println("Customer's share after buying from "+compName+" is "+share1);
							int share2=companylist.get(i).getNumbOfShare()-share;
							System.out.println("Company share after selling the share  to "+custName+" is "+share2);
							customerlist.get(j).setNumOfShare(share1);
							companylist.get(i).setNumbOfShare(share2);
							System.out.println("To sell more shares type true");
						}
					}
				}
			}
			connection.writeFileCompany(companylist);
			return customerlist;
		}while(Utility.inputBoolean());
	}
	
	//TO BUY SHARES
	public List<CustomerDetails> buyShare(List<CompanyDetails> companylist,List<CustomerDetails> customerlist) throws IOException
	{
		Controller connection=new Controller();
		do
		{
			System.out.println("Enter the name of the customer who wants to sell the shares");
			String custName=Utility.inputString();
			
			for(int i=0;i<customerlist.size();i++)
			{
				if(customerlist.get(i).getCustomerName().equals(custName))
				{
					System.out.println("Enter the name of the company who wants to buy the share");
					String compName=Utility.inputString();
					for(int j=0;j<companylist.size();j++)
					{
						if(companylist.get(j).getCompanyName().equals(compName))
						{
							System.out.println("Enter the number of share company wants to buy");
							int share=Utility.inputInteger();
							int share1=companylist.get(j).getNumbOfShare()+share;
							System.out.println("Company's share after buying the share from "+custName+" is "+share1);
							int share2=customerlist.get(i).getNumOfShare()-share;
							System.out.println("Customer's share after selling the share to "+compName+" is "+share2);
							companylist.get(j).setNumbOfShare(share1);
							customerlist.get(i).setNumOfShare(share2);
							System.out.println("To buy more shares typr true");
						}
					}
				}
			}
			connection.writeFileCompany(companylist);
			return customerlist;
		}while(Utility.inputBoolean());
	}
	
	//TO CALCULATE THE TOTAL SHARE OF THE COMPANY
	public List<CompanyDetails> totalShareComp(List<CompanyDetails> companylist)
	{
		System.out.println("Total share of the company is: ");
		int temp=0;
		for(int i=0;i<companylist.size();i++)
		{
			int share=companylist.get(i).getNumbOfShare();
			temp=temp+share;
		}
		System.out.println(temp);
		return companylist;
	}
	
	//TO CALCULATE THE TOTAL SHARE OF THE CUSTOMER
	public List<CustomerDetails> totalShareCust(List<CustomerDetails> customerlist)
	{
		System.out.println("Total share of the customer is: ");
		int temp=0;
		for(int i=0;i<customerlist.size();i++)
		{
			int share=customerlist.get(i).getNumOfShare();
			temp=temp+share;
		}
		System.out.println(temp);
		return customerlist;
	}
}
