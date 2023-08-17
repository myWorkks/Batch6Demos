package com.marolix.jdbc;

import java.util.List;

public class StudentServiceImpl implements StudentService {
	private StudentRepository srepo = new StudentRepositoryImpl();

	@Override
	public StudentDTO registerStudent(StudentDTO dto) {
		Student s = new Student();
		s.setStudent_id(dto.getStudent_id());
		s.setStudentName(dto.getStudentName());
		s.setContactNumber(dto.getContactNumber());
		s.setDoj(dto.getDoj());
		s.setGender(dto.getGender());
		srepo.insertStudent(s);
		return dto;
	}

	@Override
	public String updateStudent(String phoneNumber, String newContact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDTO> viewAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDTO viewStudent(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
