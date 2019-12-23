package com.bridgelabz.commercialdataprocessing.service;

import java.util.List;

import com.bridgelabz.commercialdataprocessing.model.CompanyDetails;
import com.bridgelabz.commercialdataprocessing.model.CustomerDetails;

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
	public List<CustomerDetails> sellShare(List<CompanyDetails> companylist, List<CustomerDetails> customerlist)
	{
		do
		{
			System.out.println("Enter the company you want to sell share from");
			String compNmae=Utility.inputString();
			
			for(int i=0;i<companylist.size();i++)
			{
				if(companylist.get(i).getCompanyName().equals(compNmae))
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
							System.out.println(customer.getNumOfShare());
						
//							int custShare=customer.getNumOfShare()+share;
//							System.out.println("total "+custShare);
							//int compShare=company.getNumbOfShare()-share;
//							System.out.println("share successfully sold");
//							System.out.println("To sell more share type true");
						}
					}
				}
			}
			return customerlist;
		}while(Utility.inputBoolean());
	}
	
	//TO BUY SHARES
	public List<CustomerDetails> buyShare(List<CompanyDetails> companylist,List<CustomerDetails> customerlist)
	{
		do
		{
			System.out.println("Enter the name of the customer who wants to buy the share");
			String custName=Utility.inputString();
			System.out.println(companylist.size()+" "+companylist);
			for(int i=0;i<customerlist.size();i++)
			{
				if(customerlist.get(i).getCustomerName().equals(custName))
				{
					System.out.println("Enter the name of the company from whom you want to buy");
					String compName=Utility.inputString();
					for(int j=0;j<companylist.size();j++)
					{
						if(companylist.get(j).getCompanyName().equals(compName))
						{
							System.out.println("Enter the number of shares you want to buy");
							int share=Utility.inputInteger();
							System.out.println(customerlist.get(i).getNumOfShare()+"ahsd");
							int finalShare=share+customer.getNumOfShare();
							System.out.println("ddddd "+finalShare);
						}
					}
				}
			}
			return customerlist;
		}while(Utility.inputBoolean());
	}
}
