package com.bridgelabz.jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysqlcon 
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya", "root", "password");
			System.out.println("connection established");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select  * from student");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			//con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}