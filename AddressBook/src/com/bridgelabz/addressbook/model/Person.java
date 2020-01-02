package com.bridgelabz.addressbook.model;

public class Person 
{
	private String fname;
	private String lname;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long phn;
	
	public String getFname() 
	{
		return fname;
	}
	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname() 
	{
		return lname;
	}
	@Override
	public String toString() 
	{
		return "PersonalDetails [fname=" + fname + ", lname=" + lname + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phn=" + phn + "]";
	}
	public void setLname(String lname)
	{
		this.lname = lname;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public String getState() 
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public int getZip() 
	{
		return zip;
	}
	public void setZip(int zip)
	{
		this.zip = zip;
	}
	public long getPhn()
	{
		return phn;
	}
	public void setPhn(long phn) 
	{
		this.phn = phn;
	}
}
