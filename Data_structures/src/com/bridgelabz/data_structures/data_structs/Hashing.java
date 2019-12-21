package com.bridgelabz.data_structures.data_structs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.bridgelabz.ds.utility.Node;
import com.bridgelabz.ds.utility.Utility1;

public class Hashing {
    //Create a list of size 11
	Node arr[]=new Node[11];
	public int data1;
	public Node next;
	public void method(int data)
	{
		Node n=new Node();
		n.data1=data;
		n.next=null;	
		int index=data%11;
		if(arr[index]==null)
		{
			arr[index]=n;
		}
		else
		{
			//Create a temporary node temp
			Node temp=new Node();
			temp=arr[index];
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
		  Node temp=arr[i];
		  if(temp!=null)
		  {
			  System.out.print("Remainder "+i+" :");
			  while(temp!=null)
			  {
				  System.out.print(temp.data1+" ");
				  temp=temp.next;
			  }
		  }
		  System.out.println();
		}
	}
	
//	public boolean search(int key)
//	{
//		System.out.println("enter a number you want to search: ");
//		Scanner sc=new Scanner(System.in);
//		Node node=new Node();
//		key=sc.nextInt();
//		node.data1=key;
//		Node search=next;
//		for(int i=0;i<arr.length;i++)
//		{
//			while(data1!=0)
//			{
//			if(search.data1==key)
//			{
//			    Node temp=new Node();
//			    
//			}
//			search=search.next;	
//		}
//		return false;
//		}
//		return false;
//	}
	
	public static void main(String[] args) throws IOException
	{
		Utility1 list=new Utility1();
		FileReader fr=new FileReader("/home/admin1/eclipse-workspace/Data_structures/src/hashing.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str,s="";
		String[] array;
		
		while((str=br.readLine())!=null)
		{
			s=s+str;
		}
		array=s.split(" ");
		int arr2[]=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			arr2[i]=Integer.parseInt(array[i]);
			Hashing h=new Hashing();
			h.method(arr2[i]);
			h.display();
//			System.out.println("Enter a number you want to search:");
//			Scanner scan=new Scanner(System.in);
//			int sc=scan.nextInt();
//			boolean bool=h.search(sc);
//			if(bool)
//			{
//				list.pop(sc);
//			}
//			else
//			{
//				list.push(sc);
//			}
//			String m="";
//			for(i=0;i<list.size();i++)
//			{
//				String x=Integer.toString(list.indexOf(i));
//				m=m+x;
//				//m=m+"";
//			}
//			h.display();
			BufferedWriter bw=new BufferedWriter(new FileWriter("/home/admin1/eclipse-workspace/Data_structures/src/hashing.txt"));
			//bw.write(m+" ");
			bw.flush();
			bw.close();
		}		
	}
}
