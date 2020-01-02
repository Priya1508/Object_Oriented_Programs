package com.bridgelabz.commercialdataprocessing.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.commercialdataprocessing.model.CompanyDetails;
import com.bridgelabz.commercialdataprocessing.model.CustomerDetails;
import com.bridgelabz.commercialdataprocessing.model.TransactionDetails;
import com.bridgelabz.commercialdataprocessing.repository.Controller;
import com.bridgelabz.commercialdataprocessing.service.Operation;
import com.bridgelabz.commercialdataprocessing.service.Utility;

public class StockAccount
{
	public static void main(String[] args) throws IOException 
	{
		Controller connection=new Controller();
		Operation operation=new Operation();
		do
		{
			System.out.println("Enter 1 to Add Company");
			System.out.println("Enter 2 to Add Customer");
			System.out.println("Enter 3 to Sell Company Shares to customer");
			System.out.println("Enter 4 to Buy Comapny Shares from customer");
			System.out.println("Enter 5 to calculate the total shares of all the Company's");
			System.out.println("Enter 6 to calculate the total shares of all the Customer's");
//			List<CompanyDetails> list=new LinkedList<>();
//			List<CustomerDetails> list1=new LinkedList<>();
//			List<CustomerDetails> list2=new LinkedList<>();

			int choice = Utility.inputInteger();
			switch(choice)
			{
			case 1:
				List<CompanyDetails> info = connection.readFileCompanyDetails();
				List<CompanyDetails> companylist = operation.addCompany(info);
				connection.writeFileCompany(companylist);
				break;
				
			case 2:
				List<CustomerDetails> info1 = connection.readFileCustomerDetails();
				List<CustomerDetails> customerlist = operation.addCustomer(info1);
				connection.writeFileCustomer(customerlist);
				break;
				
			case 3:
				List<CompanyDetails> list = connection.readFileCompanyDetails();
				List<CustomerDetails> list1 = connection.readFileCustomerDetails();
				List<TransactionDetails> list2 = new LinkedList<>();
//				List<CompanyDetails> info2 = connection.readFileCompanyDetails();
//				List<CustomerDetails> info3 = connection.readFileCustomerDetails();
//				List<TransactionDetails> info4 = connection.readFileTransaction();
				List<CustomerDetails> customerlist1 = operation.sellShare(list, list1, list2);
				connection.writeFileCustomer(customerlist1);
				break;
				
			case 4:
				List<CompanyDetails> list3 = connection.readFileCompanyDetails();
				List<CustomerDetails> list4 = connection.readFileCustomerDetails();
				List<TransactionDetails> list5 = new LinkedList<>();
//				List<CompanyDetails> info5 = connection.readFileCompanyDetails();
//				List<CustomerDetails> info6 = connection.readFileCustomerDetails();
//				List<TransactionDetails> info7 = connection.readFileTransaction();
				List<CustomerDetails> customerlist2 = operation.buyShare(list3, list4, list5);
				connection.writeFileCustomer(customerlist2);
				
				break;
				
			case 5:
				List<CompanyDetails> info8 = connection.readFileCompanyDetails();
				List<CompanyDetails> companylist3 = operation.totalShareComp(info8);
				break;
				
			case 6:
				List<CustomerDetails> info9 = connection.readFileCustomerDetails();
				List<CustomerDetails> customerlist4 = operation.totalShareCust(info9);
				break;
			}
		}while(Utility.inputBoolean());
	}
}
