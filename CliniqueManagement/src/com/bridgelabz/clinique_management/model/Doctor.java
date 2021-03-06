package com.bridgelabz.clinique_management.model;

public class Doctor 
{
	private String Name;
	private int Id;
	private String Specialization;
	private String Availability;
	private int Appointment;
	public int getAppointment() 
	{
		return Appointment;
	}
	public void setAppointment(int appointment)
	{
		Appointment = appointment;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public int getId() 
	{
		return Id;
	}
	public void setId(int id) 
	{
		Id = id;
	}
	public String getSpecialization() 
	{
		return Specialization;
	}
	public void setSpecialization(String specialization)
	{
		Specialization = specialization;
	}
	public String getAvailability() 
	{
		return Availability;
	}
	public void setAvailability(String availability)
	{
		Availability = availability;
	}
	@Override
	public String toString() 
	{
		return "Doctor [Name=" + Name + ", Id=" + Id + ", Specialization=" + Specialization + ", Availability="
				+ Availability + ", Appointment=" + Appointment + "]";
	}
}
