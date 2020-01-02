package com.bridgelabz.addressbook.services;

import java.util.List;

import com.bridgelabz.addressbook.model.Person;

public class Operation {

	//TO ADD PERSON TO THE ADDRESS BOOK
	public List <Person> addUser(List <Person> listOfPerson) {
		do {
			Person person = new Person();

			System.out.println("Enter the First Name: ");
			person.setFname(Utility.inputString());
			System.out.println("Enter the Last Name: ");
			person.setLname(Utility.inputString());
			System.out.println("Enter the Address: ");
			person.setAddress(Utility.inputString());
			System.out.println("Enter the City: ");
			person.setCity(Utility.inputString());
			System.out.println("Enter the State: ");
			person.setState(Utility.inputString());
			System.out.println("Enter the Zip Code: ");
			person.setZip(Utility.inputInteger());
			System.out.println("Enter the Phone Number: ");
			person.setPhn(Utility.inputLong());
            //Adding the details given in person to the listOfPerson
			listOfPerson.add(person);
			System.out.println("Person added successfully");
			System.out.println("To add more person type true");
			return listOfPerson;
		} while (Utility.inputBoolean());
	}

	//TO DELETE A PERSON's DETAIL FROM THE ADDRESS BOOK
	public boolean deleteUser(List <Person> listOfPerson) {
		do 
		{
			System.out.println("Enter the First Name of the person you want to delete: ");
			String firstName = Utility.inputString();
			for (int i = 0; i < listOfPerson.size(); i++) 
			{
				if (listOfPerson.get(i).getFname().equals(firstName)) 
				{
					listOfPerson.remove(i);
					System.out.println("Person's detail deleted successfully");
					System.out.println("To delete more person ");
					break;
				}
			}
		} while (Utility.inputBoolean());
		return false;
	}

	//EDITING A PERSON's DETAIL IN THE EXISTING ADDRESS BOOK
	public List <Person> editUser(List <Person> listOfPerson)
	{
	    System.out.println("Enter the First Name you want to make changes in: ");
	    String fname = Utility.inputString();
	    for(int i = 0; i < listOfPerson.size(); i++)
	    {
	    	if(listOfPerson.get(i).getFname().equals(fname))
	    	{
	    		Person temp = listOfPerson.get(i);
	          do {
		            System.out.println("Enter the detail you want to edit: ");
		            System.out.println("Enter 1 to edit Last Name: ");
		            System.out.println("Enter 2 to edit Address: ");
		            System.out.println("Enter 3 to edit City: ");
		            System.out.println("Enter 4 to edit State: ");
		            System.out.println("Enter 5 to edit Zip code: ");
		            System.out.println("Enter 6 to edit Phone Number: ");
		            int choice = Utility.inputInteger();
		            switch(choice)
		            {
		               case 1:
			                   System.out.println("Enter the new Last Name");
			                   temp.setLname(Utility.inputString());             
			                   System.out.println("Details saved successfully");
			                   break;
			                   
		               case 2:
		            	   System.out.println("Enter the New Address");
		            	   temp.setAddress(Utility.inputString());
		            	   System.out.println("Details saved successfully");
		            	   break;
		            	   
		               case 3:
		            	   System.out.println("Enter the New City");
		            	   temp.setCity(Utility.inputString());
		            	   System.out.println("Details saved successfully");
		            	   break;
		            	   
		               case 4:
		            	   System.out.println("Enter the New State");
		            	   temp.setState(Utility.inputString());
		            	   System.out.println("Details saved successfully");
		            	   break;
		            	   
		               case 5:
		            	   System.out.println("Enter the new Zip code");
		            	   temp.setZip(Utility.inputInteger());
		            	   System.out.println("Details saved successfully");
		            	   break;
		            	   
		               case 6:
		            	   System.out.println("Enter the New Phone Number");
		            	   temp.setPhn(Utility.inputLong());
		            	   System.out.println("Details saved successfully");
		            	   break;
		            	   
		            	   default:
		            		   System.out.println("Invaild choice");
		            		   break;
		            }   
		          listOfPerson.add(temp);
		          return listOfPerson;
	             }while(Utility.inputBoolean());
	        }
	    }
	    return listOfPerson;
	}
	
	//SORTING THE ADDRESS BOOK IN A PROPER ORDER
	public List <Person> sortZip(List <Person> listOfPerson)
	{
		for(int i = 0; i < listOfPerson.size(); i++)
		{
			for(int j = i+1; j < listOfPerson.size(); j++)
			{
				if(listOfPerson.get(i).getZip() > listOfPerson.get(j).getZip())
				{
					Person temp;
					temp = listOfPerson.get(i);
					listOfPerson.set(i, listOfPerson.get(j));
					listOfPerson.set(j, temp);
				}
			}
		}
		return listOfPerson;
	}
	
	//TO SORT THE ADDRESS BOOK BY LAST NAME
	public List <Person> sortLastName(List <Person> listOfPerson)
	{
		for(int i = 0; i < listOfPerson.size(); i++)
		{
			for(int j = i+1; j < listOfPerson.size(); j++)
			{
				if(listOfPerson.get(i).getLname().compareTo(listOfPerson.get(j).getLname())>0)
				{
					Person temp;
					temp = listOfPerson.get(i);
					listOfPerson.set(i, listOfPerson.get(j));
					listOfPerson.set(j, temp);
				}
			}
		}
		return listOfPerson;
	}
	
	//TO FIND THE DETAILS THE PERSON FROM THE ADDRESS BOOK
	public List <Person> getDetails(List <Person> listOfPerson)
	{
		System.out.println("Enter the First Name of the Person you want the details of:");
		String name = Utility.inputString();	
		for(int i = 0; i < listOfPerson.size(); i++)
		{
			if(listOfPerson.get(i).getFname().equals(name))
			{
				Person temp = listOfPerson.get(i);
				System.out.println(temp.toString());
			}
			else
			{
				System.out.println("Person not found");
			}
		}
		return listOfPerson;
	}
}
