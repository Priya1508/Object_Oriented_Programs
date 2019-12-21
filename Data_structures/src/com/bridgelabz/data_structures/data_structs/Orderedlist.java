package com.bridgelabz.data_structures.data_structs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.ds.utility.Utility1;
/**
 * Purpose : Read a list of numbers from a file and arrange in ascending order in a linked list.Take user input for a number,if found then pop the number out of the list
 *           else insert the number 
 * @author : Priya Nagare
 * @Date : 09 Dec 2019
 *
 */
public class Orderedlist {

	public static void main(String[] args) throws IOException {
		//To read data from file
		FileReader fr=new FileReader("/home/admin1/eclipse-workspace/Data_structures/src/ordered.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		String s="";
	
		while((str=br.readLine())!=null)
		{
			s=str;
		}
		//To split the array
		String[] arr=s.split(" ");
		int[] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=Integer.parseInt(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr2));
		//sorting of the elements
		Utility1.bubbleSort(arr2, 0, 0);
		for(int i : arr2)
		{
			//adding element to linked list
			Utility1.insert(i);
		}
		System.out.println();
		Utility1.display();
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int sc=scan.nextInt();
		boolean bool=Utility1.search(sc);
		if(bool)
		{
			Utility1.pop(sc);
		}
		else
		{
			Utility1.push(sc);
		}
		String m="";
		for(int i=0;i<Utility1.size();i++)
		{
			String x=Integer.toString(Utility1.indexOf(i));
			m=m+x;
			m=m+" ";
		}
		Utility1.display();
		//To write the data on the file
		BufferedWriter bw=new BufferedWriter(new FileWriter("/home/admin1/eclipse-workspace/Data_structures/src/ordered.txt"));
		bw.write(m+" ");
		bw.close();
	}
}
