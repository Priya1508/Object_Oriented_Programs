package com.bridgelabz.addressbook.repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.addressbook.model.PersonalDetails;

public class Controller 
{
	PersonalDetails person=new PersonalDetails();
	static ObjectMapper mapper;
	
	static
	{
		mapper=new ObjectMapper();
	}
	File file=new File("AddressBook.json");
	
	/**
	 * READ FROM FILE
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 * 
	 */
	
	public List<PersonalDetails> readFile() throws JsonParseException, JsonMappingException, IOException
	{
		List<PersonalDetails> info=mapper.readValue(file, new TypeReference <List<PersonalDetails>>() {});
		return info;
	}
	
	/**
	 * WRITE FILE
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 * 
	 */
	
	public void writeFile(List<PersonalDetails> personlist) throws JsonGenerationException, JsonMappingException, IOException
	{
		mapper.defaultPrettyPrintingWriter().writeValue(file, personlist);
	}
}
