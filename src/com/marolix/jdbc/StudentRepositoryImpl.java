package com.marolix.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
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
		List<Student> list = new ArrayList<Student>();
		Connection c = null;
		try {
			c = DBConfig.connectDB();

			Statement st = c.createStatement();
			String query = "select * from student_details;";
			System.out.println(query);
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				Student s = new Student();
				String name = rs.getString("Std_name");
				Integer id = rs.getInt(1);
				Date date = rs.getDate("Date_of_admission");
				// String date = rs.getString("Date_of_admission");
				LocalDate dt = LocalDate.parse(date.toString());
				s.setDoj(dt);
				String phonenumber = rs.getString(5);
				String gender = rs.getString("Gender");
				if (gender.equalsIgnoreCase("male"))
					s.setGender(Gender.MALE);
				else if (gender.equalsIgnoreCase("female"))
					s.setGender(Gender.FEMALE);
				else
					s.setGender(Gender.OTHERS);
				s.setStudentName(name);
				s.setStudent_id(id);

				s.setContactNumber(phonenumber);
				list.add(s);
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (c != null || !c.isClosed()) {
					c.close();
				}
			} catch (SQLException e) {

				throw new RuntimeException(e.getMessage());
			}
		}
		return list;
	}

	@Override
	public Student readStudentByPhoneNumber(String phoneNumber) {

		return null;
	}

	@Override
	public void updatePhoneNumber(String oldPhoneNumber, String newPhoneNumber) {
		Connection c = null;
		try {
			c = DBConfig.connectDB();
			Statement st = c.createStatement();
			String query = String.format("update student_details set contact_number=\"%s\" where contact_number=\"%s\"",
					newPhoneNumber, oldPhoneNumber);
			st.executeUpdate(query);

		} catch (ClassNotFoundException | SQLException e) {
			//System.out.println(e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				if (c != null || !c.isClosed()) {
					c.close();
				}
			} catch (SQLException e) {

				throw new RuntimeException(e.getMessage());
			}
		}

	}

	@Override
	public void deleteStudent(String phoneNumber) {
		
	}

}
