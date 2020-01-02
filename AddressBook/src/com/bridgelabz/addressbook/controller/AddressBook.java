package com.bridgelabz.addressbook.controller;

import java.io.IOException;
import java.util.List;

import com.bridgelabz.addressbook.model.Person;
import com.bridgelabz.addressbook.repository.Controller;
import com.bridgelabz.addressbook.services.Operation;
import com.bridgelabz.addressbook.services.Utility;

public class AddressBook {

	public static void main(String[] args) throws IOException 
	{
		Controller connection = new Controller();
		Operation operation = new Operation();
		do
		{
			System.out.println("Enter your choice: ");
			System.out.println();
			System.out.println("Enter 1 to Add a Person's Detail");
			System.out.println("Enter 2 to Delete a Person's Detail");
			System.out.println("Enter 3 to Edit the Person's Details");
			System.out.println("Enter 4 to sort the address book by zip code");
			System.out.println("Enter 5 to sort the address book by last name");
			System.out.println("Enter 6 to get the details of the specific Person");
			
			int choice = Utility.inputInteger();
			switch(choice)
			{
			   case 1:
				   List<Person> read = connection.readFile();
				   List<Person> personlist = operation.addUser(read);
				   connection.writeFile(personlist);
				   break;
				   
			   case 2:
				   List<Person> read1 = connection.readFile();
				   boolean listOfPerson = operation.deleteUser(read1);
				   if(listOfPerson == true)
				   {
					   System.out.println();
				   }
				   connection.writeFile(read1);
				   break;
				   
			   case 3:
				   List<Person> read3 = connection.readFile();
				   List<Person> personlist1 = operation.editUser(read3);
				   connection.writeFile(personlist1);
				   break;
				   
			   case 4:
				   List<Person> read4=connection.readFile();
				   List<Person> personlist2=operation.sortZip(read4);
				   System.out.println("Sorted address book by zip code is ");
				   System.out.println(personlist2);
				   break;
				   
			   case 5:
				   List<Person> read5 = connection.readFile();
				   List<Person> personlist3 = operation.sortLastName(read5);
				   System.out.println("Sorted address book by last name is ");
				   System.out.println(personlist3);
				   break;
				   
			   case 6:
				   List<Person> read6 = connection.readFile();
				   List<Person> personlist4 = operation.getDetails(read6);
				   break;
			}
		}while(Utility.inputBoolean());
	}
}
