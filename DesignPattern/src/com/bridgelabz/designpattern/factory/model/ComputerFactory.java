package com.bridgelabz.designpattern.factory.model;

import com.bridgelabz.designpattern.factory.Computer;
import com.bridgelabz.designpattern.factory.PC;
import com.bridgelabz.designpattern.factory.Server;
import com.bridgelabz.designpattern.factory.SuperComputer;

public class ComputerFactory 
{
	public static Computer createComputer	(ComputerType type,String ram,String hdd,String cpu)
	{
		Computer comp=null;
		switch(type)
		{
		case PC:
			comp=new PC(ram,hdd,cpu);
			break;
			
		case SERVER:
			comp=new Server(ram,hdd,cpu);
			break;
			
		case SUPERCOMPUTER:
			comp=new SuperComputer();
		}
		return comp;
	}

}
