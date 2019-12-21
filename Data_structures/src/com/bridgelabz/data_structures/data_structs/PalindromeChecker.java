package com.bridgelabz.data_structures.data_structs;

import java.util.Scanner;

import com.bridgelabz.ds.utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args) {
		Utility u=new Utility();
		System.out.println("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		String palindrome=sc.nextLine();
		for(int i=palindrome.length()-1;i>=0;i--)
		{
			String ch=String.valueOf(palindrome.charAt(i));
			Utility.addFront(ch);
		}
		boolean status=false;
		for(int i=palindrome.length()-1;i>=0;i--)
		{
			if(String.valueOf(palindrome.charAt(i)).equalsIgnoreCase(u.peekFront()))
			{
				Utility.removeFront();
				status=true;
			}
			else
			{
				status=false;
				break;
			}
		}
		if(status)
		{
			System.out.println("Palindrome string");
		}
		else
		{
			System.out.println("Not a palindrome string");
		}
	}
}
