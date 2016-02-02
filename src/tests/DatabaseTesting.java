package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mx4j.tools.remote.ConnectionManager;

public class DatabaseTesting {

	public static void main(String[] args) {
		String host  = "localhost";
		String port = "3306";
		String database = "QADB";
		
		//jdbc://mysql://host:port/database
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://"+ host + ":" + port + "/" + database,"root", "");
			Statement Query = con.createStatement();
			ResultSet RS = Query.executeQuery("select * from EmployeeInfo");
			while(RS.next()){
				System.out.println(RS.getString("name"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	
	
	}
}
	
	