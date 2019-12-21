package com.bridgelabz.clinique_management.service;

import java.util.List;

import com.bridgelabz.clinique_management.model.Appointment;
import com.bridgelabz.clinique_management.model.Doctor;
import com.bridgelabz.clinique_management.model.Patient;

public class Operation 
{
	Doctor doctor=new Doctor();
	
	//TO ADD DOCTOR
	public List<Doctor> addDoctor(List<Doctor> doctorlist)
	{
		do {
			
			Doctor doc=new Doctor();
		     System.out.println("Enter the Doctor's Name");
		     String name=Utility.inputString();
		     doc.setName(name);
		     System.out.println("Enter Doctor's Id");
		     int id=Utility.inputInteger();
		     doc.setId(id);
		
		     System.out.println("Enter Doctor's Specailization");
		     String specaility=Utility.inputString();
		     doc.setSpecialization(specaility);
		
		     System.out.println("Enter Doctor's Availability");
		     String availablity=Utility.inputString();
		     doc.setAvailability(availablity);
		
		     System.out.println("Enter the number of Appointment");
		     int appointment=Utility.inputInteger();
		     doc.setAppointment(appointment);
		     
		     doctorlist.add(doc);
		     System.out.println("To add more Doctor type TRUE");
		     return doctorlist;
	    }while(Utility.inputBoolean());
	}
	
	//TO ADD PATIENT
	public List<Patient> addPatient(List<Patient> patientlist)
	{
		do
		{
			Patient pat=new Patient();
			System.out.println("Enter the Patient's Name");
			String name=Utility.inputString();
			pat.setName(name);
			
			System.out.println("Enter Patient's Id");
			int id=Utility.inputInteger();
			pat.setId(id);
			
			System.out.println("Enter Patient's Mobile Number");
			int mobnum=Utility.inputInteger();
			pat.setMobnum(mobnum);
			
			System.out.println("Enter Patient's Age");
			int age=Utility.inputInteger();
			pat.setAge(age);
			patientlist.add(pat);
			
			System.out.println("To add more type TRUE");
			return patientlist;
		}while(Utility.inputBoolean());
	}
}
