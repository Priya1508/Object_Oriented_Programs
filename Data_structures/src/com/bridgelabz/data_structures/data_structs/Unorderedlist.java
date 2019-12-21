package com.bridgelabz.data_structures.data_structs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.ds.utility.Utility;
/**
 * Purpose : Read text from file,split into words and arrange it as linked list.Take an input to search a word,
 *           if the word is not found add it to the list,and if not found add it in the list
 * @author : Priya Nagare
 * @Date : 09 Dec 2019
 *
 */
public class Unorderedlist 
{
	public static void main(String[] args) throws IOException 
	{
		Utility list=new Utility();
		FileReader fr=new FileReader("/home/admin1/eclipse-workspace/Data_structures/unorderd.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		String s="";
		String[] array;
		while((str=br.readLine())!=null)
		{
			s=s+str;
		}
		array=s.split(" ");
		for(int i=0;i<array.length;i++)
		{
			Utility.add(array[i]);
		}
		Utility.display();
		System.out.println("Enter the string you want to search: ");
		Scanner scan=new Scanner(System.in);
		String sc=scan.nextLine();
		list.search(sc);
		System.out.println(sc);
		boolean bool=list.search(sc);
		if(bool)
		{
			Utility.remove(sc);
		}
		else
		{
			Utility.add(sc);
		}
		String m="";
		for(int i=0;i<list.size();i++)
		{
			m=m+list.indexOf(i);
		}
		Utility.display();
		BufferedWriter bw=new BufferedWriter(new FileWriter("/home/admin1/eclipse-workspace/Data_structures/unorderd.txt"));
		bw.write(m+" ");
		bw.close();		
	}
}
