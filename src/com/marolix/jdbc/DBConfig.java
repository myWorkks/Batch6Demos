package com.marolix.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConfig {
	private DBConfig() {
	}

	public static Connection connectDB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/session_6_jdbc";
		String username = "root";
		String password = "root";

		Connection c = DriverManager.getConnection(url, username, password);
		return c;
	}
}
