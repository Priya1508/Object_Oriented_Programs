package com.bridgelabz.stockmanagement.repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.stockmanagement.model.StockDetails;

public class Controller 
{
	StockDetails stock=new StockDetails();
	static ObjectMapper mapper;
	static
	{
		mapper=new ObjectMapper();
	}
	File file=new File("Stock.json");
	
	//READ FROM FILE
	public List<StockDetails> readFile() throws IOException
	{
		List<StockDetails> info=mapper.readValue(file, new TypeReference <List<StockDetails>>() {});
		return info;
	}
	//WRITE ON FILE
	public void writeFile(List<StockDetails> stocklist) throws IOException
	{
		mapper.defaultPrettyPrintingWriter().writeValue(file, stocklist);
	}
}
