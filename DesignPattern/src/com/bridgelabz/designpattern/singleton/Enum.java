package com.bridgelabz.designpattern.singleton;

public class Enum
{
	public static void main(String[] args) 
	{
		Abe obj=Abe.INSTANCE;
		obj.i=5;
		obj.show();
		
		Abe obj1=Abe.INSTANCE;
		obj1.i=6;
		obj1.show();
	}
}

enum Abe
{
	INSTANCE;
	int i;
	public void show()
	{
		System.out.println(i);
	}
}
