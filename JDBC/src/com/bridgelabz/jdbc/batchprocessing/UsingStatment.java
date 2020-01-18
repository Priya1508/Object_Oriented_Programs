package com.bridgelabz.jdbc.batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UsingStatment 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch", "root", "password");
			con.setAutoCommit(false);
			Statement stmt=con.createStatement();
			stmt.addBatch("insert into student values(1,'priya')");
			stmt.addBatch("insert into student values(2,'shweta')");
			stmt.addBatch("insert into student values(3,'tushar')");
			stmt.executeBatch();
			con.commit();
		} 
		catch (Exception e)
		{
			System.out.println("Connection failed");
		}
	}
}
