package com.bridgelabz.jdbc.student1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementMain
{
	public static void main(String[] args)
	{
		Student s=new Student();
		do
		{
			System.out.println("Enter your choice");
			System.out.println("Enter 1 to create data");
			System.out.println("Enter 2 to display the table");
			System.out.println("Enter 3 to delete the student info");
			System.out.println("Enter 4 to update the student info");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the name of the student: ");
				String name=Utility.inputString();
				s.setName(name);
				System.out.println("Enter the roll number");
				int rollno=Utility.inputInteger();
				s.setRollNo(rollno);
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya1","root","password");
					PreparedStatement pst=con.prepareStatement("insert into student1(name,rollno) values(?,?)");
					pst.setString(1, s.getName());
					pst.setInt(2,s.getRollNo());
					int x=pst.executeUpdate();
					pst.close();
					//con.close();
					if(x==1)
					{
						System.out.println("Record inserted successfully");
					}
				}
				catch (Exception e)
				{
					System.out.println("Connection failed");
				}
				break;
				
			case 2:
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya1","root","password");
					PreparedStatement pst=con.prepareStatement("select * from student1");
					ResultSet rs=pst.executeQuery();
					while(rs.next())
					{
						System.out.println(rs.getString(1)+" "+rs.getString(2));
					}
					rs.close();
					pst.close();
				}
				catch (Exception e)
				{
					System.out.println("Connection failed");
				}
				break;
				
			case 3:
				try 
				{
					System.out.println("Enter the roll number to delete");
					int rollnum=Utility.inputInteger();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya1","root","password");
					PreparedStatement pst=con.prepareStatement("delete from student1 where rollno=?");
					pst.setInt(1,rollnum);
					int x=pst.executeUpdate();
					if(x==1)
					{
						System.out.println("Record deleted successfully");
					}
					else
					{
						System.out.println("Record not found");
					}
				} 
				catch (Exception e)
				{
					System.out.println("Connection failed");
				}
				break;
				
			case 4:
				System.out.println("Enter the old name");
				String name2=Utility.inputString();
				System.out.println("Enter the new name");
				String name1=Utility.inputString();
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya1","root","password");
					String str="update student1 set name=? where name=?";
					PreparedStatement pst=con.prepareStatement(str);
					pst.setString(1,name1);
					pst.setString(2,name2);
					int x=pst.executeUpdate();
					if(x==1)
					{
						System.out.println("Record updated");
					}
					else
					{
						System.out.println("Record not found");
					}
				} 
				catch (Exception e)
				{
					System.out.println("Connection failed");
				}		
			}
		}while(Utility.inputBoolean());
	}
}
