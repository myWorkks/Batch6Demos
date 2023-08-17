package com.marolix.jdbc;

import java.util.List;

public interface StudentRepository {
	public Student insertStudent(Student std);

	public List<Student> readAllStudents();

	public Student readStudentByPhoneNumber(String phoneNumber);

	public void updatePhoneNumber(String phoneNumer, String phoneNumber);

	public void deleteStudent(String phoneNumber);
}
