package com.bridgelabz.commercialdataprocessing.repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.commercialdataprocessing.model.CompanyDetails;
import com.bridgelabz.commercialdataprocessing.model.CustomerDetails;
import com.bridgelabz.commercialdataprocessing.model.TransactionDetails;

public class Controller 
{
	CompanyDetails company=new CompanyDetails();
	CustomerDetails customer=new CustomerDetails();
	static ObjectMapper mapper;
	static
	{
		mapper=new ObjectMapper();
	}
	
	File file1=new File("Company.json");
	File file2=new File("Customer.json");
	File file3=new File("Transaction.json");
	
	//READ FILE OF COMPANY
	public List<CompanyDetails> readFileCompanyDetails() throws IOException
	{
		List<CompanyDetails> info=mapper.readValue(file1, new TypeReference <List<CompanyDetails>>() {});
		return info;
	}
	
	//WRITE DATA ON COMPNAY FILE
	public void writeFileCompany(List<CompanyDetails> companylist) throws IOException
	{
		mapper.defaultPrettyPrintingWriter().writeValue(file1, companylist);
	}
	
	//READ FILE OF CUSTOMER
	public List<CustomerDetails> readFileCustomerDetails() throws IOException
	{
		List<CustomerDetails> info2=mapper.readValue(file2, new TypeReference <List<CustomerDetails>>() {});
		return info2;
	}
	
	//WRITE DATA ON CUSTOMER FILE
	public void writeFileCustomer(List<CustomerDetails> customerlist) throws IOException
	{
		mapper.defaultPrettyPrintingWriter().writeValue(file2, customerlist);
	}
	
	//READ FILE FROM TRANSACTION
	public List<TransactionDetails> readFileTransaction() throws IOException
	{
		List<TransactionDetails> info3=mapper.readValue(file3, new TypeReference <List<TransactionDetails>>() {});
		return info3;
	}
	
	//WRITE DATA ON TRANSACTION FILE
	public void writeFileTransaction(List<TransactionDetails> transactionlist) throws IOException
	{
		mapper.defaultPrettyPrintingWriter().writeValue(file3, transactionlist);
	}
}
