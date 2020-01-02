package com.bridgelabz.designpattern.singleton;

public class DoubleCheckedLocking 
{
	public static void main(String[] args)
	{
		Thread t1=new Thread(new Runnable()
		{
			public void run()
			{
				DoubleChecked obj=DoubleChecked.getInstance();
			}
		});
		
		Thread t2=new Thread(new Runnable()
		{
			public void run()
			{
				DoubleChecked obj=DoubleChecked.getInstance();
			}
		});
		t1.start();
		t2.start();
	}
}

class DoubleChecked
{
	private static DoubleChecked obj;
	private DoubleChecked()
	{
		System.out.println("Double Checked Locking Instance");
	}
	public static DoubleChecked getInstance()
	{
		if(obj==null)
		{
			synchronized(DoubleChecked.class)
			{
				if(obj==null)
				{
					obj=new DoubleChecked();
				}
			}
		}
		return obj;
	}
}
