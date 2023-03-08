package javaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MenuDrivenex1 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop","root","root");
       int choice;
       System.out.println("*****college database system******");
       while(true){
       {
    	   System.out.println("press 1 to insert data into database");
       
         System.out.println("enter your choice");
         choice=sc.nextInt();
         switch(choice)
         {
         case 1:
        	 PreparedStatement ps1 = conn.prepareStatement("insert into college values(?,?,?)");
        	System.out.println("enter id");
        	int cid =sc.nextInt();
        	System.out.println("enter name");
        	String cname=sc.nextLine();
        	System.out.println("enter city");
        	String ccity =sc.next();
        	
        	ps1.setInt(1, cid);
        	ps1.setString(2, cname);
        	ps1.setString(3, ccity);
        	
        	ps1.executeUpdate();
        	System.out.println("record inserted sucesfully");
        
         }
       break;
       }

       }
	
