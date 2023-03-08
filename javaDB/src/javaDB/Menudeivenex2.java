package javaDB;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.Scanner;
	public class Menudeivenex2 {
	

		public static void main(String[] args)throws ClassNotFoundException,Exception{
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop", "root", "root");
			int op;
			while (true) {
	            {
	                
	                
	                System.out.println("Menu\n1.Insert data\n2.Update data\n3.Search data\n4.Delete data\n5.Selecct\n6.Count");
	                System.out.println("Enter your choice");
	                op=sc.nextInt();
	                switch(op) {
	                case 1:
	                	PreparedStatement ps=con.prepareStatement("insert into product1 values (?,?,?)");
	                	System.out.println("Enter product ID : ");
	                	int pid=sc.nextInt();
	                	System.out.println("Enter product name : ");
	                	String pname=sc.next();
	                	System.out.println("Enter product price : ");
	                	int pprice=sc.nextInt();
	                	
	                	ps.setInt(1, pid);
	                	ps.setString(2, pname);
	                	ps.setInt(3, pprice);
	                	ps.executeUpdate();
	                	System.out.println("Inserted successfully");
	                	break;
	                
	                case 2:
	                	PreparedStatement ps1=con.prepareStatement("update product1 set pname=?,pprice=? where pid=?");
	                	System.out.println("Enter product ID : ");
	                	int pid1=sc.nextInt();
	                	System.out.println("Enter product name : ");
	                	String pname1=sc.next();
	                	System.out.println("Enter product price : ");
	                	int pprice1=sc.nextInt();
	                	
	                	ps1.setString(1, pname1);
	                	ps1.setInt(2, pprice1);
	                    ps1.setInt(3, pid1);
	                	ps1.executeUpdate();
	                	System.out.println("Updated successfully");
	                	break;
	                
	                case 3:
	                	PreparedStatement ps4=con.prepareStatement("select * from product1 where pid=?");
	                	System.out.println("Enter product ID : ");
	                	int pid4=sc.nextInt();
	                	ps4.setInt(1, pid4);
	             
	                	ResultSet rs1=ps4.executeQuery();
	                	while(rs1.next()) {
	                		int pid5=rs1.getInt(1);
	                		String pname5=rs1.getString(2);
	                		int pprice5=rs1.getInt(3);
	                		System.out.println("Product ID "+pid5+" Product Name : "+pname5+" Product Price : "+pprice5);
	                	}
	                	break;
	                	
	                
	                case 4:
	                	PreparedStatement ps2=con.prepareStatement("delete from product1 where pid=?");
	                	System.out.println("Enter product ID : ");
	                	int pid2=sc.nextInt();
	                	ps2.setInt(1, pid2);
	                	ps2.executeUpdate();
	                	System.out.println("Deleted successfully");
	                	break;
	                case 5:
	                	PreparedStatement ps3=con.prepareStatement("Select * from product1");
	                	ResultSet rs=ps3.executeQuery();
	                	while(rs.next()) {
	                		int pid3=rs.getInt(1);
	                		String pname3=rs.getString(2);
	                		int pprice3=rs.getInt(3);
	                		System.out.println("Product ID "+pid3+" Product Name : "+pname3+" Product Price : "+pprice3);
	                	}
	                	break;
	                case 6:
	                	PreparedStatement ps6=con.prepareStatement("select count(*) from product1");
	                	System.out.println(ps6);
	                	break;
	                	
	                
	               
	                
	                

	            }

			}
		}
	}
	}


