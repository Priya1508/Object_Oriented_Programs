package com.bridgelabz.jdbc.transactionmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UsingPreparedStatement 
{
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		do
		{
			System.out.println("Enter the employee's Id");
			int id=Utility.inputInteger();
			emp.setId(id);
			System.out.println("Enter the employee's name");
			String name=Utility.inputString();
			emp.setName(name);
			System.out.println("Enter the employee's salary");
			int salary=Utility.inputInteger();
			emp.setSalary(salary);
			try 
			{
				//System.out.println("1");
				Class.forName("com.mysql.jdbc.Driver");
				//System.out.println("2");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/transaction", "root", "password");
				//System.out.println("3");
				con.setAutoCommit(false);
				PreparedStatement pstmt=con.prepareStatement("insert into employee1(id,name,salary) values(?,?,?)");
				pstmt.setInt(1, emp.getId());
				pstmt.setString(2, emp.getName());
				pstmt.setInt(3, emp.getSalary());
				do
				{
					System.out.println("Enter false to commit");
				}while(Utility.inputBoolean());
				int x=pstmt.executeUpdate();
				con.commit();
				if(x==1)
				{
					System.out.println("Details recorded successfully");
				}
			}
			catch (Exception e)
			{
				System.out.println("Connection failed");
			}
		}while(Utility.inputBoolean());
	}
}
