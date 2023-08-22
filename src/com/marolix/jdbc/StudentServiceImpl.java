package com.marolix.jdbc;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

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
		srepo.updatePhoneNumber(phoneNumber, newContact);
		return "phone number updated successfully";
	}

	@Override
	public List<StudentDTO> viewAllStudents() {
		List<Student> list = srepo.readAllStudents();
		if (list.isEmpty())
			throw new RuntimeException("no student details found");
		// Integer student_id, String studentName, Gender gender, LocalDate doj, String
		// contactNumber
		return list
				.stream().map(student -> new StudentDTO(student.getStudent_id(), student.getStudentName(),
						student.getGender(), student.getDoj(), student.getContactNumber()))
				.collect(Collectors.toList());

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
