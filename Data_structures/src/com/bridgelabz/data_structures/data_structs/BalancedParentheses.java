package com.bridgelabz.data_structures.data_structs;
import com.bridgelabz.ds.utility.Utility;

public class BalancedParentheses 
{
	public static void main(String[] args)
	{
		String str = ")))))((";
		char ch = 0;
		for (int i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			if (ch == '(' || ch=='{' || ch=='[') 
			{
				//To insert the element
				Utility.push1(ch);
			}
		}
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch==')' || ch=='}' || ch==']')
			{
				if(Utility.isEmpty1()==false)
				{
					//To remove the element
					Utility.pop1();
				}
				else
				{
					Utility.push1(ch);
				}
			}
		}
		//If the stack is empty then the parentheses are balanced
			if(Utility.isEmpty1()==true)
			{
				System.out.println("Balanced parentheses");
			}
			else
			{
				System.out.println("Parentheses not balanced");
			}
	}
}
