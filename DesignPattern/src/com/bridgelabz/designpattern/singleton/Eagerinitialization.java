package com.bridgelabz.designpattern.singleton;

public class Eagerinitialization 
{
	public static void main(String[] args) 
	{
		Abc obj=Abc.getInstance();
	}
}

class Abc
{
	static Abc obj=new Abc();
	private Abc()
	{
		System.out.println("Eager Instance created");
	}
	public static Abc getInstance()
	{
		return obj;
	}
}

