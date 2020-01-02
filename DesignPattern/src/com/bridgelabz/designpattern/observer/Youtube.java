package com.bridgelabz.designpattern.observer;

public class Youtube 
{
	public static void main(String[] args)
	{
		Channel bridgelabz=new Channel();
		Subscriber s1=new Subscriber("Priya");
		Subscriber s2=new Subscriber("Tushar");
		Subscriber s3=new Subscriber("Shweta");
		Subscriber s4=new Subscriber("Akshay");
		Subscriber s5=new Subscriber("Nisha");
		
		bridgelabz.subscribe(s1);
		bridgelabz.subscribe(s2);
		bridgelabz.subscribe(s3);
		bridgelabz.subscribe(s4);
		bridgelabz.subscribe(s5);
		
		bridgelabz.unSubscribe(s3);
		
		s1.subscribeChannel(bridgelabz);
		s2.subscribeChannel(bridgelabz);
		s3.subscribeChannel(bridgelabz);
		s4.subscribeChannel(bridgelabz);
		s5.subscribeChannel(bridgelabz);
		
		bridgelabz.upload("How to learn programming"	);

	}
}
