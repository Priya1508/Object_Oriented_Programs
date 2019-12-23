package com.bridgelabz.commercialdataprocessing.controller;

import java.io.IOException;
import java.util.List;

import com.bridgelabz.commercialdataprocessing.model.CompanyDetails;
import com.bridgelabz.commercialdataprocessing.model.CustomerDetails;
import com.bridgelabz.commercialdataprocessing.repository.Controller;
import com.bridgelabz.commercialdataprocessing.service.Operation;
import com.bridgelabz.commercialdataprocessing.service.Utility;

public class StockAccount {

	public static void main(String[] args) throws IOException 
	{
		Controller connection=new Controller();
		Operation operation=new Operation();
		do
		{
			System.out.println("Enter 1 to add company details");
			System.out.println("Enter 2 to add customer details");
			System.out.println("Enter 3 to sell company shares");
			System.out.println("Enter 4 to buy comapny shares");
			System.out.println("Enter 5 to calculate the total shares of the company");
			System.out.println("Enter 6 to calculate the total shares of the customer");
			//List<CompanyDetails> list=new LinkedList<>();
			//List<CustomerDetails> list1=new LinkedList<>();
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:
				List<CompanyDetails> info=connection.readFileCompanyDetails();
				List<CompanyDetails> companylist=operation.addCompany(info);
				connection.writeFileCompany(companylist);
				break;
				
			case 2:
				List<CustomerDetails> info1=connection.readFileCustomerDetails();
				List<CustomerDetails> customerlist=operation.addCustomer(info1);
				connection.writeFileCustomer(customerlist);
				break;
				
			case 3:
				List<CompanyDetails> info2=connection.readFileCompanyDetails();
				List<CustomerDetails> info3=connection.readFileCustomerDetails();
				List<CustomerDetails> customerlist1=operation.sellShare(info2,info3);
				connection.writeFileCustomer(customerlist1);
				break;
				
			case 4:
				List<CompanyDetails> info4=connection.readFileCompanyDetails();
				List<CustomerDetails> info5=connection.readFileCustomerDetails();
				List<CustomerDetails>  customerlist2=operation.buyShare(info4,info5);
				connection.writeFileCustomer(customerlist2);
				break;
			}
			
		}while(Utility.inputBoolean());
	}

}
