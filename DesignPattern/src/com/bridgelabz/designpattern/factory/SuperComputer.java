package com.bridgelabz.designpattern.factory;

public class SuperComputer implements Computer
{
	@Override
	public String getRAM()
	{
		return null;
	}
	
	@Override
	public String getHDD()
	{
		return null;
	}
	
	@Override
	public String getCPU()
	{
		return null;
	}

	@Override
	public String toString() {
		return "SuperComputer []";
	}

}
