package com.bridgelabz.clinique_management.model;

public class Patient 
{
	private String Name;
	private int Id;
	private int Mobnum;
	private int Age;
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
	public int getMobnum()
	{
		return Mobnum;
	}
	public void setMobnum(int mobnum) 
	{
		Mobnum = mobnum;
	}
	public int getAge()
	{
		return Age;
	}
	public void setAge(int age) 
	{
		Age = age;
	}
	@Override
	public String toString() 
	{
		return "Patient [Name=" + Name + ", Id=" + Id + ", Mobnum=" + Mobnum + ", Age=" + Age + "]";
	}
}
