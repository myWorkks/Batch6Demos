package com.marolix.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

	@Override
	public Student insertStudent(Student std) {
		Connection c = null;
		try {
			c = DBConfig.connectDB();

			Statement st = c.createStatement();

			String query = "insert into student_details(std_name,gender,date_of_admission,contact_number) values(\""
					+ std.getStudentName() + "\",\"" + std.getGender() + "\",\"" + std.getDoj() + "\",\""
					+ std.getContactNumber() + "\"" + ");";
			System.out.println(query);
			st.executeUpdate(query);
		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} finally {
			try {
				if (c != null || !c.isClosed()) {
					c.close();
				}
			} catch (SQLException e) {

				System.out.println(e.getMessage());
			}

		}
		return std;
	}

	@Override
	public List<Student> readAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student readStudentByPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePhoneNumber(String phoneNumer, String phoneNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(String phoneNumber) {
		// TODO Auto-generated method stub

	}

}
