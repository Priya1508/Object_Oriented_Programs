package com.bridgelabz.addressbook.services;

import java.util.List;

import com.bridgelabz.addressbook.model.PersonalDetails;

public class Operation {

	//TO ADD PERSON TO THE ADDRESS BOOK
	public List<PersonalDetails> addUser(List<PersonalDetails> listOfPerson) {
		do {
			PersonalDetails person = new PersonalDetails();

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
	public boolean deleteUser(List<PersonalDetails> listOfPerson) {
		do 
		{
			System.out.println("Enter the First Name of the person you want to delete: ");
			String firstName = Utility.inputString();

			for (int i = 0; i < listOfPerson.size();i++) 
			{
				if (listOfPerson.get(i).getFname().equals(firstName)) 
				{
					listOfPerson.remove(i);
					System.out.println("Person's detail deleted successfully");
					System.out.println("To delete more person ");
					return true;
				}
				else
				{
					System.out.println("data not found");
					return false;
				}
			}
		} while (Utility.inputBoolean());
		return false;
	}

	//EDITING A PERSON's DETAIL IN THE EXISTING ADDRESS BOOK
	public List<PersonalDetails> editUser(List<PersonalDetails> listOfPerson)
	{
	    System.out.println("Enter the First Name you want to make changes in: ");
	    String fname=Utility.inputString();
	    for(int i=0;i<listOfPerson.size();i++)
	    {
	    	if(listOfPerson.get(i).getFname().equals(fname))
	    	{
	    		PersonalDetails temp=listOfPerson.get(i);
	          do {
		            System.out.println("Enter the detail you want to edit: ");
		            System.out.println("Enter 1 to edit Last Name: ");
		            System.out.println("Enter 2 to edit Address: ");
		            System.out.println("Enter 3 to edit City: ");
		            System.out.println("Enter 4 to edit State: ");
		            System.out.println("Enter 5 to edit Zip code: ");
		            System.out.println("Enter 6 to edit Phone Number: ");
		            int choice=Utility.inputInteger();
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
		            	   break;
		            	   
		               case 3:
		            	   System.out.println("Enter the New City");
		            	   temp.setCity(Utility.inputString());
		            	   break;
		            	   
		               case 4:
		            	   System.out.println("Enter the New State");
		            	   temp.setState(Utility.inputString());
		            	   break;
		            	   
		               case 5:
		            	   System.out.println("Enter the new Zip code");
		            	   temp.setZip(Utility.inputInteger());
		            	   break;
		            	   
		               case 6:
		            	   System.out.println("Enter the New Phone Number");
		            	   temp.setPhn(Utility.inputLong());
		            	   break;
		            	   
		            	   default:
		            		   System.out.println("Invaild choice");
		            		   break;
		            }
	             }while(Utility.inputBoolean());
	        }
	    	else
	    	{
	    		System.out.println("Name not found");
	    	}
	    }
	    return listOfPerson;
	}
	
	//SORTING THE ADDRESS BOOK IN A PROPER ORDER
//	public List<PersonalDetails> sortZip(List<PersonalDetails> listOfPerson)
//	{
//		for(int i=0;i<listOfPerson.size();i++)
//		{
//			for(int j=0;j<listOfPerson.size();j++)
//			{
//				//PersonalDetails temp=listOfPerson.get(i);
//				if(listOfPerson.>listOfPerson.get(j))
//				{
//					
//				}
//			}
//		}
//	}
	
	//TO FIND THE DETAILS THE PERSON FROM THE ADDRESS BOOK
	public List<PersonalDetails> getDetails(List<PersonalDetails> listOfPerson)
	{
		System.out.println("Enter the First Name of the Person you want the details of:");
		String name=Utility.inputString();
		
		for(int i=0;i<listOfPerson.size();i++)
		{
			if(listOfPerson.get(i).getFname().equals(name))
			{
				PersonalDetails temp=listOfPerson.get(i);
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
