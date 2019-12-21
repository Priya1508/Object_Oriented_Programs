package com.bridgelabz.ds.utility;

import java.util.NoSuchElementException;

public class Utility1 
{
	public static Node top=null;
	public static Node front=null;
	public static Node rear=null;
	public static Node head=null;
	
	static int size=0;
	//To push(add) the element in the stack
	public static int push(int item)
	{
		Node temp=new Node();
		temp.next=top;
		top=temp;
		return temp.data1;
	}
	//To pop(remove) the element from the stack
	public static int pop(int item)
	{
		if(top==null)
		{
			throw new NoSuchElementException("Stack is empty");
		}
		int temp=(int)top.data1;
		top=top.next;
		return temp;
	}
	//To retrieve the element from the stack where the top is pointing
	public static int peek()
	{
		if(top==null)
		{
			throw new NoSuchElementException("Stack is empty");
		}
		System.out.println("Element is "+top.data);
		return top.data1;
	}
	//To check if the stack is empty
	public static boolean isEmpty()
	{
		return top==null;
	}
	//To display the list
	public static void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	//To get the size of the list
	public static int size()
	{
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;	
		}
		return count;
	}
	//To create an empty list
	public static boolean orderedList()
	{
		return head==null;
	}
	//To add elements in list
	public static void add(int item)
	{
		Node node=new Node();
		node.data1=item;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	//To remove elements from list
	public static void remove(int item)
	{
		Node temp=new Node();
		temp=head;
		Node n;
		if(head==null)
		{
			System.out.println("Removal is impossible");
		}
		else
		{
			while(temp.next.next!=null)
			{
				if(temp.next.data1==item)
				{
					n=temp.next;
					temp.next=n.next;
				}
				temp=temp.next;
			}
		}
	}
	//To search the element passed int the list
	public static boolean search(int item)
	{
		Node temp=new Node();
		temp=head;
		while(temp.next!=null)
		{
			if(item==temp.data1)
			{
				return true;
			}
			temp=temp.next;
		}
		if(item==temp.data1)
		{
			return true;
		}
		return false;
	}
	//To return the index of the given element
	public static int indexOf(int index)
	{
		int len=size();
		Node temp=head;
		int count=0;
		while(temp.next!=null)
		{
			if(count==index)
			{
				return temp.data1;
			}
			count=count+1;
			temp=temp.next;
		}
		if(len==size())
		{
			return temp.data1;
		}
		return 0;
	}
	//For sorting of ordered list
	public static void bubbleSort(int arr[],int i,int j)
	{
		int temp;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	//To insert the values in the array
	public static void insert(int item)
	{
		Node n=new Node();
		Node temp=n;
		n.data1=item;
		n.next=null;
		if(head==null)
		{
			head=n;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
	}

}
