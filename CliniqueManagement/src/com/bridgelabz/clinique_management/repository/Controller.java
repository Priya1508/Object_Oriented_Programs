package com.bridgelabz.clinique_management.repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.clinique_management.model.Doctor;
import com.bridgelabz.clinique_management.model.Patient;

public class Controller 
{ 
	Doctor doctor=new Doctor();
	Patient patient=new Patient();
	static ObjectMapper mapper;
	static 
	{
		mapper=new ObjectMapper();
	}
	File fileDoctor=new File("Doctor.json");
	File filePatient=new File("Patient.json");
	File fileAppointment=new File("Appointment.json");
	
	//TO READ FILE FROM DOCTOR
	public List<Doctor> readFileDoctor() throws JsonParseException, JsonMappingException, IOException
	{
		List<Doctor> info=mapper.readValue(fileDoctor, new TypeReference <List<Doctor>>() {});
		return info;
	}
	
	//TO WRITE ON DOCTOR FILE
		public void writeFileDoctor(List<Doctor> doctorlist) throws IOException
		{
			mapper.defaultPrettyPrintingWriter().writeValue(fileDoctor, doctorlist);
		}
		
	//TO READ FILE FROM PATIENT
	public List<Patient> readFilePatient() throws JsonParseException, JsonMappingException, IOException
	{
		List<Patient> info1=mapper.readValue(filePatient, new TypeReference <List<Patient>>() {});
		return info1;
	}
	
	//TO WRITE ON PATIENT FILE
	public void writeFilePatient(List<Patient> patientlist) throws IOException
	{
		mapper.defaultPrettyPrintingWriter().writeValue(filePatient, patientlist);
	}

}
