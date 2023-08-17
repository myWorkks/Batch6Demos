package com.marolix.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class JDBCConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		// Class.forName("java.lang.Strings1");
		String url = "jdbc:mysql://localhost:3306/session_6_jdbc";
		String username = "root";
		String password = "root";

		Connection c = DriverManager.getConnection(url, username, password);

		Statement st = c.createStatement();
		String s = " select * from student_details;";
		String insert = "insert into student_details values(1,\"bharath\",\"male \",\"2020-07-13\",\"9063388012\");";
		ResultSet rs = st.executeQuery(s);
		// int a = st.executeUpdate(insert);
		// System.out.println(a);
		// System.out.println(rs.next());

		while (rs.next()) {
			int std_id = rs.getInt(1);
			String std_name = rs.getString(2);
			String gender = rs.getString(3);
			Date date = rs.getDate(4);
			String phone_number = rs.getString(5);

			System.out.println("stdent_id = " + std_id + " studentname = " + std_name + " gender= " + gender
					+ " date = " + date + " contact = " + phone_number);
		}

	}

}
