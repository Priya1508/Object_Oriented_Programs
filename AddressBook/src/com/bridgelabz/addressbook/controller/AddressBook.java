package com.bridgelabz.addressbook.controller;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.addressbook.model.PersonalDetails;
import com.bridgelabz.addressbook.repository.Controller;
import com.bridgelabz.addressbook.services.Operation;
import com.bridgelabz.addressbook.services.Utility;

public class AddressBook {

	public static void main(String[] args) throws IOException 
	{
		Controller connection=new Controller();
		Operation operation=new Operation();
		ObjectMapper mapper=new ObjectMapper();
		do
		{
			System.out.println("Enter your choice: ");
			System.out.println();
			System.out.println("Enter 1 to Add a Person's Detail");
			System.out.println("Enter 2 to Delete a Person's Detail");
			System.out.println("Enter 3 to Edit the Person's Details");
			System.out.println("Enter 4 to sort the address book by zip code");
			System.out.println("Enter 5 to get the details of the specific Person");
			
			int choice=Utility.inputInteger();
			switch(choice)
			{
			   case 1:
				   List<PersonalDetails> read=connection.readFile();
				   List<PersonalDetails> personlist=operation.addUser(read);
				   mapper.defaultPrettyPrintingWriter().writeValue(new File("AddressBook.json"), personlist);
				   break;
				   
			   case 2:
				   List<PersonalDetails> read1=connection.readFile();
				   boolean listOfPerson=operation.deleteUser(read1);
				   if(listOfPerson==true) {
					   System.out.println();
				   }
				   else
				   {
					   System.out.println();
				   }
				   connection.writeFile(read1);
				   break;
				   
			   case 3:
				   List<PersonalDetails> read3=connection.readFile();
				   List<PersonalDetails> personlist1=operation.editUser(read3);
				   mapper.defaultPrettyPrintingWriter().writeValue(new File("AddressBook.json"), personlist1);
				   break;
				   
			   case 4:
//				   List<PersonalDetails> read4=connection.readFile();
//				   List<PersonalDetails> personlist2=operation.sortZip(read4);
//				   mapper.defaultPrettyPrintingWriter().writeValue(new File("AddressBook.json"), personlist2);
//				   break;
				   
			   case 5:
				   List<PersonalDetails> read5=connection.readFile();
				   List<PersonalDetails> personlist3=operation.getDetails(read5);
				   break;
			}
		}while(Utility.inputBoolean());
	}
}
