package com.bridgelabz.inventorymanagement.repository;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.inventorymanagement.model.Details;


public class Controller
{
	Details details=new Details();
	static ObjectMapper mapper;
	static 
	{
		mapper=new ObjectMapper();
	}
	File file=new File("Inventory.json");
	
	//TO READ THE FILE
	
	public List<Details> readFile() throws  IOException
	{
		List<Details> info=mapper.readValue(file, new TypeReference <List<Details>>() {});
		return info;
	}
	
	//TO WRITE FILE
	
	public void writeFile (List<Details> detaillist) throws  IOException
	{
		mapper.defaultPrettyPrintingWriter().writeValue(file, detaillist);
	}
}
