package com.bridgelabz.clinique_management.model;

public class Appointment 
{
	private String docName;
	private int patId;
	private String docSpecialization;
	private String docAvailability;
	private int docAppointment;
	
	public String getDocName()
	{
		return docName;
	}
	public void setDocName(String docName) 
	{
		this.docName = docName;
	}
	public int getPatId() 
	{
		return patId;
	}
	public void setPatId(int patId)
	{
		this.patId = patId;
	}
	public String getDocSpecialization() 
	{
		return docSpecialization;
	}
	public void setDocSpecialization(String docSpecialization)
	{
		this.docSpecialization = docSpecialization;
	}
	public String getDocAvailability() 
	{
		return docAvailability;
	}
	public void setDocAvailability(String docAvailability) 
	{
		this.docAvailability = docAvailability;
	}
	public int getDocAppointment()
	{
		return docAppointment;
	}
	public void setDocAppointment(int docAppointment) 
	{
		this.docAppointment = docAppointment;
	}
	@Override
	public String toString() {
		return "Appointment [docName=" + docName + ", patId=" + patId + ", docSpecialization=" + docSpecialization
				+ ", docAvailability=" + docAvailability + ", docAppointment=" + docAppointment + "]";
	}
}
