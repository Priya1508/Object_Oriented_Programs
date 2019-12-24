package com.bridgelabz.clinique_management.controller;

import java.io.IOException;
import java.util.List;

import com.bridgelabz.clinique_management.model.Doctor;
import com.bridgelabz.clinique_management.model.Patient;
import com.bridgelabz.clinique_management.repository.Controller;
import com.bridgelabz.clinique_management.service.Operation;
import com.bridgelabz.clinique_management.service.SearchOperation;
import com.bridgelabz.clinique_management.service.Utility;

public class CliniqueManagement 
{
	public static void main(String[] args) throws IOException
	{
		Operation operation=new Operation();
		SearchOperation so=new SearchOperation();
		Controller connection=new Controller();
		do
		{
			
			System.out.println("Enter 1 to add Doctor");
			System.out.println("Enter 2 to add Patient");
			System.out.println("Enter 3 to search Doctor");
			System.out.println("Enter 4 to get details of the Patient");
			System.out.println("Enter 5 to take Appointment");

			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:
				//List<Doctor> list1 = new LinkedList<>();
				List<Doctor> info=connection.readFileDoctor();
				List<Doctor> doctorlist=operation.addDoctor(info);
				connection.writeFileDoctor(doctorlist);
				break;
				
			case 2:
				//List<Patient> list2=new LinkedList<>();
				List<Patient>info1=connection.readFilePatient();
				List<Patient> patientlist=operation.addPatient(info1);
				connection.writeFilePatient(patientlist);
				break;
				
			case 3:
				List<Doctor> search=connection.readFileDoctor();
				List<Doctor> doctorlist1=so.searchDoctor(search);
				break;
				
			case 4:
				List<Patient> detail=connection.readFilePatient();
				List<Patient> patientlist1=SearchOperation.printDetail(detail);
				break;
				
			case 5:
				List<Doctor> info2=connection.readFileDoctor();
				List<Patient> info3=connection.readFilePatient();
				List<Doctor> doctorlist2=so.takeAppointment(info2,info3);
				connection.writeFileDoctor(doctorlist2);
			}
		}while(Utility.inputBoolean());
	}
}
