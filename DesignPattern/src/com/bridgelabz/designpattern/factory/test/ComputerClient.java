package com.bridgelabz.designpattern.factory.test;

import com.bridgelabz.designpattern.factory.Computer;
import com.bridgelabz.designpattern.factory.model.ComputerFactory;
import com.bridgelabz.designpattern.factory.model.ComputerType;

public class ComputerClient 
{
	public static void main(String[] args) 
	{
		Computer pc=ComputerFactory.createComputer(ComputerType.PC, "1 GB", "256 GB", "Intel Core 2 Duo");
		System.out.println(pc);
		Computer server=ComputerFactory.createComputer(ComputerType.SERVER, "32 GB", "1 TB", "AMD Ryzen 7 2700X");
		System.out.println(server);
		Computer supercomputer=ComputerFactory.createComputer(ComputerType.SUPERCOMPUTER, "32 GB", "1 TB", "AMD Ryzen 7 2700X"); 
		System.out.println(supercomputer);
	}
}
