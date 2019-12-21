package com.bridgelabz.data_structures.data_structs;

import java.util.ArrayList;

import com.bridgelabz.ds.utility.Utility;

public class PrimeArray2D
{
	public static void main(String[] args) 
	{
		ArrayList[] list= new ArrayList[10];
		int count=0,i=0,temp=100;
		for(int j=0;j<10;j++)
		{
			list[j]=new ArrayList();
		}
		while(i<10)
		{
			for(int n=2;n<=1000;n++)
			{
				count=Utility.isPrime(n);
				if(count==0)
				{
					list[i].add(n);
				}
				if(n==temp)
				{
					i++;
					temp=temp+100;
				}
			}
		}
		for(ArrayList listItem: list)
		{
			System.out.println(listItem);
		}
	}
}
