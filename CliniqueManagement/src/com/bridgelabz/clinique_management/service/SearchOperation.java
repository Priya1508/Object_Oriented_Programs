package com.bridgelabz.clinique_management.service;

import java.util.List;

import com.bridgelabz.clinique_management.model.Doctor;
import com.bridgelabz.clinique_management.model.Patient;

public class SearchOperation 
{
	Doctor doctor=new Doctor();
	Patient patient=new Patient();
	
	//TO SEARCH DOCTOR
		public List<Doctor> searchDoctor(List<Doctor> doctorlist)
		{
			do
			{
				System.out.println("Enter 1 to search Doctor by Name");
				System.out.println("Enter 2 to search Doctor by Id");
				System.out.println("Enter 3 to search Doctor by Specialization");
				System.out.println("Enter 4 to search Doctor by Availability");
				int choice=Utility.inputInteger();
				
				switch(choice)
				{
				case 1: 
					System.out.println("Enter the Name of the Doctor");
					String name=Utility.inputString();
					
					for(int i=0;i<doctorlist.size();i++) 
					{
						if(doctorlist.get(i).getName().equals(name))
						{
							System.out.println(doctorlist.get(i).toString());
						}
					}
					break;
					
				case 2: 
					System.out.println("Enter the Doctor's Id");
					int id=Utility.inputInteger();
					
					for(int i=0;i<doctorlist.size();i++)
					{
						if(doctorlist.get(i).getId()==id)
						{
							System.out.println(doctorlist.get(i).toString());
						}
					}
					break;
					
				case 3:
					System.out.println("Enter the Specialization of Doctor");
					String specialization=Utility.inputString();
					for(int i=0;i<doctorlist.size();i++)
					{
						if(doctorlist.get(i).getSpecialization().equals(specialization))
						{
							System.out.println(doctorlist.get(i).toString());
						}
					}
					break;
					
				case 4:
					System.out.println("Enter the Availability");
					String avail=Utility.inputString();
					for(int i=0;i<doctorlist.size();i++)
					{
						if(doctorlist.get(i).getAvailability().equals(avail))
						{
							System.out.println(doctorlist.get(i).toString());
						}
					}
					break;
				}
				System.out.println("To search more type TRUE");
				return doctorlist;
			}while(Utility.inputBoolean());
		}
		
		//TO PRINT THE DETAILS OF THE PATIENT
		public static List<Patient> printDetail(List<Patient> patientlist)
		{
			do
			{
				System.out.println("Enter 1 to Print the details by Name");
				System.out.println("Enter 2 to Print the details by Id");
				System.out.println("Enter 3 tp Print the details by Mobile number");
				System.out.println("Enter 4 to Print the details by Age");
				int choice=Utility.inputInteger();
				
				switch(choice)
				{
				case 1 :
					System.out.println("Enter the Name of the Patient");
					String name=Utility.inputString();
					for(int i=0;i<patientlist.size();i++)
					{
						if(patientlist.get(i).getName().equals(name))
						{
							System.out.println(patientlist.get(i).toString());
						}
					}
					break;
					
				case 2:
					System.out.println("Enter the Id of the patient");
					int id=Utility.inputInteger();
					for(int i=0;i<patientlist.size();i++) 
					{
						if(patientlist.get(i).getId()==id)
						{
							System.out.println(patientlist.get(i).toString());
						}
					}
					break;
					
				case 3:
					System.out.println("Enter the Mobile NUmber");
					int mobnum=Utility.inputInteger();
					for(int i=0;i<patientlist.size();i++) 	
					{
						if(patientlist.get(i).getMobnum()==mobnum)
						{
							System.out.println(patientlist.get(i).toString());
						}
					}
					break;
					
				case 4:
					System.out.println("Enter the Age");
					int age=Utility.inputInteger();
					for(int i=0;i<patientlist.size();i++)
					{
						if(patientlist.get(i).getAge()==age)
						{
							System.out.println(patientlist.get(i).toString());
						}
					}
					break;
				}
				System.out.println("To search more deatils type TRUE");
				return patientlist;
			}while(Utility.inputBoolean());
		}
		
		//TO TAKE APPOINTMENT
		public static List<Doctor> takeAppointment(List<Doctor> doctorlist,List<Patient> patientlist)
		{
			do
			{
				System.out.println("Enter the Patient's Id");
				int id=Utility.inputInteger();
				for(int j=0;j<patientlist.size();j++)
				{
					if(patientlist.get(j).getId()==id)
					{
						System.out.println("Enter the name of the Doctor");
						String docName=Utility.inputString();
					
						for(int i=0;i<doctorlist.size();i++)
						{
							if(doctorlist.get(i).getName().equals(docName))
							{
								System.out.println("Enter the specialization you want");
								String special=Utility.inputString();
								if(doctorlist.get(i).getSpecialization().equals(special))
								{
									System.out.println("Enter the shift you want");
									String shift=Utility.inputString();
									if(doctorlist.get(i).getAvailability().equals(shift))
									{
										if(doctorlist.get(i).getAppointment()<5)
										{
											int temp=0;
											temp=temp+doctorlist.get(i).getAppointment()+1;
											doctorlist.get(i).setAppointment(temp);
											System.out.println("Appointment fixed of "+id+" with "+docName);
										}
										else
										{
											System.out.println("Doctor not available take another appointment");
										}
									}
									else
									{
										System.out.println("Doctor not available at the given shift");
									}
								}
								else
								{
									System.out.println("Doctor not available for the specified specialization");
								}
								System.out.println("To take more appointment type true");
							}
						}
					}
				}
				return doctorlist;
			}while(Utility.inputBoolean());
		}
}
