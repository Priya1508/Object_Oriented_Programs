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
			System.out.println("Enter 1 to Add Company");
			System.out.println("Enter 2 to Add Customer");
			System.out.println("Enter 3 to Sell Company Shares");
			System.out.println("Enter 4 to Buy Comapny Shares");
			System.out.println("Enter 5 to calculate the total shares of all the Company's");
			System.out.println("Enter 6 to calculate the total shares of all the Customer's");
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
				List<CustomerDetails> customerlist2=operation.buyShare(info4,info5);
				connection.writeFileCustomer(customerlist2);
				break;
				
			case 5:
				List<CompanyDetails> info6=connection.readFileCompanyDetails();
				List<CompanyDetails> companylist3=operation.totalShareComp(info6);
				break;
				
			case 6:
				List<CustomerDetails> info7=connection.readFileCustomerDetails();
				List<CustomerDetails> customerlist4=operation.totalShareCust(info7);
				break;
			}
			
		}while(Utility.inputBoolean());
	}

}
