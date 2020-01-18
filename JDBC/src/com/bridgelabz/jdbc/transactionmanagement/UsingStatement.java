package com.bridgelabz.jdbc.transactionmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsingStatement
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/transaction", "root", "password");
			con.setAutoCommit(false);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			con.commit();
		} catch (Exception e)
		{
			System.out.println("Connection not built");
		}
	}
}
