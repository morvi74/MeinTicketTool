package application;

import java.sql.*;

public final class DBModel {
	
	public static Connection openDB (String dbPath) {
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			//C:\\Users\\VZTZO7Q\\Documents\\test.db
			conn = DriverManager.getConnection("jdbc:sqlite:"+dbPath);
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully!");
		return conn;
		
	}

	public static boolean CreateTableCOMPANY(Connection conn) {
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			String sql = "CREATE TABLE COMPANY " + 
					"(ID INT)PRIMARY KEY    NOT NULL, " + 
					"NAME            TEXT   NOT NULL, " +
					"AGE             INT    NOT NULL, " +
					"ADDRESS         CHAR(50), " +
					"SALARY          REAL)";
			stmt.executeUpdate(sql);
			stmt.close();			
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Table created successfully!");
		return true;
	}
	
	public static boolean InsertIntoCOMPANY(Connection conn) {
		Statement stmt = null;
		
		try {		
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql = "INSERT INTO COMPANY (ID, NAME, AGE, ADDRESS, SALARY) " +
					"VALUES (1, 'Paul', 32, 'California', 20000.00);";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO COMPANY (ID, NAME, AGE, ADDRESS, SALARY) " +
					"VALUES (2, 'Allen', 25, 'Texas', 15000.00);";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO COMPANY (ID, NAME, AGE, ADDRESS, SALARY) " +
					"VALUES (3, 'Teddy', 23, 'Norway', 20000.00);";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO COMPANY (ID, NAME, AGE, ADDRESS, SALARY) " +
					"VALUES (4, 'Mark', 25, 'Richmond', 65000.00);";
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.commit();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Records inserted successfully");
		return true;
	}
	
	public static ResultSet SelectCOMPANY(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			rs  = stmt.executeQuery("SELECT * FROM COMPANY;");
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getString("address");
				float salary = rs.getFloat("salary");
				
				System.out.println( "ID: " + id);
				System.out.println( "NAME: " + name);
				System.out.println( "AGE: " + age);
				System.out.println( "ADDRESS: " + address);
				System.out.println( "SALARY: " + salary);
				System.out.println();
			}
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Operation done successfully!");
		return rs;
	}
	//UPDATE mit ?
	//DELETE mit ?	
}
