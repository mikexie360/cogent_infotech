package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query = "call retreive_persons";
		String connectionURL = "jdbc:mysql://localhost:3306/cogentdb";
		
		try (
			Connection conn = DriverManager.getConnection(connectionURL, "root","root");
			CallableStatement stmt = conn.prepareCall(query);

			) 
		{
			//int rows = stmt.executeUpdate(query);
			//System.out.println("Rows inserted; " + rows);
			
			//int row = stmt.executeUpdate("delete from employee where emp_name='Shiva'");
			//System.out.println("RowsUpdated" + row);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("First Name: " + rs.getString(2));
				System.out.println("Last Name: " + rs.getString(3));

			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		query = "select * from actor order by first_name";
		connectionURL = "jdbc:mysql://localhost:3306/sakila";
		try (
				Connection conn = DriverManager.getConnection(connectionURL, "root","root");
				PreparedStatement pstmt = conn.prepareStatement(query);
				) 
			{
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.println("actor ID: " +rs.getInt("actor_id"));
					System.out.println("first name: " +rs.getString("first_name"));
					System.out.println("last name: " + rs.getString("last_name"));
					System.out.println("last update: " + rs.getString("last_update"));

				}
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		*/
	
	}

}
