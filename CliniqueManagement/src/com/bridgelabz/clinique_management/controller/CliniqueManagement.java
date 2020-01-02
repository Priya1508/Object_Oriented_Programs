package com.bridgelabz.clinique_management.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.print.Doc;

import com.bridgelabz.clinique_management.model.Appointment;
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
			System.out.println("Enter 6 to take the Appointment details");

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
				List<Doctor> doctorlist2=SearchOperation.takeAppointment(info2,info3);
				connection.writeFileDoctor(doctorlist2);
				break;
				
			case 6:
//				List<Doctor> list=connection.readFileDoctor();
//				List<Patient> list1=connection.readFilePatient();
//				List<Appointment> list2=new LinkedList<>();
				List<Doctor> info4=connection.readFileDoctor();
				List<Patient> info5=connection.readFilePatient();
				List<Appointment> info6=connection.readFileAppointment();
				List<Appointment> appointmentlist=SearchOperation.appointmentDetails(info4,info5,info6);
				connection.writeFileAppointment(appointmentlist);
				break;
			}
		}while(Utility.inputBoolean());
	}
}
