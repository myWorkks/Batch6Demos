package com.marolix.jdbc;

import java.time.LocalDate;

public class StudentDTO {

	private Integer student_id;
	private String studentName;
	private Gender gender;
	private LocalDate doj;
	private String contactNumber;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public StudentDTO(String studentName, Gender gender, LocalDate doj, String contactNumber) {
		super();
		this.studentName = studentName;
		this.gender = gender;
		this.doj = doj;
		this.contactNumber = contactNumber;
	}

	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", gender=" + gender + ", doj=" + doj + ", contactNumber="
				+ contactNumber + "]";
	}

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public StudentDTO(Integer student_id, String studentName, Gender gender, LocalDate doj, String contactNumber) {
		super();
		this.student_id = student_id;
		this.studentName = studentName;
		this.gender = gender;
		this.doj = doj;
		this.contactNumber = contactNumber;
	}

}
