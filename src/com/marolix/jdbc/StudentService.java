package com.marolix.jdbc;

import java.util.List;

public interface StudentService {
	public StudentDTO registerStudent(StudentDTO dto);

	public String updateStudent(String phoneNumber, String newContact);

	public List<StudentDTO> viewAllStudents();

	public StudentDTO viewStudent(String phoneNumber);

	public String deleteStudent(String phoneNumber);
}
