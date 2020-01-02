package com.bridgelabz.designpattern.singleton;

public class ThreadsafeSingleton
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Runnable()
		{
			public void run()
			{
				ThreadSafe obj=ThreadSafe.getInstance();
			}
		});
		
		Thread t2=new Thread(new Runnable()
		{
			public void run()
			{
				ThreadSafe obj=ThreadSafe.getInstance();
			}
		});
		
		t1.start();
		t2.start();
	}
}

class ThreadSafe
{
	public static ThreadSafe obj;
	private ThreadSafe()
	{
		System.out.println("Thread safe singleton created");
	}
	
	public static synchronized ThreadSafe getInstance()
	{
		if(obj==null)
		{
			obj=new ThreadSafe();
		}
		return obj;
	}
}
