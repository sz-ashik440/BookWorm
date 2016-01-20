package model;

import java.sql.*;

public class dbConnect {
	private static Connection conn;

	public static Connection connectDB() {
		// JDBC driver name and database URL
		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost/bookWormDB";

		// Database credentials
		String USER = "root";
		String PASS = "AsHik440";

		try {
			// Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// Open a connection
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
		return conn;
	}

}
