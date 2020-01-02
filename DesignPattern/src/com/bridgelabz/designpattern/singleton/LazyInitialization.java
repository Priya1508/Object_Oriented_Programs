package com.bridgelabz.designpattern.singleton;

public class LazyInitialization
{
	public static void main(String[] args)
	{
		Abd obj=Abd.getInstance();
	}
}

class Abd
{
    static Abd obj;
	private Abd()
	{
		System.out.println("Lazy Instance created");
	}
	public static Abd getInstance()
	{
		if(obj==null)
		{
			obj=new Abd();
		}
		return obj;
	}
}
