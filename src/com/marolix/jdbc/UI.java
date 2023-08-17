package com.marolix.jdbc;

import java.time.LocalDate;
import java.util.Scanner;

public class UI {
	private static StudentService studentService = new StudentServiceImpl();

	public static void main(String[] args) {
		registerStudent();
	}

	public static void registerStudent() {
		System.out.println("enter student name");
		Scanner sc = new Scanner(System.in);
		String std_name = sc.next();
		System.out.println("enter phone number");
		String contact = sc.next();
		LocalDate doj = LocalDate.now();
		System.out.println("select gender 0 for male 1 female 2 for others");
		int genderid = sc.nextInt();
		Gender gender = null;
		if (genderid == 0)
			gender = Gender.MALE;
		else if (genderid == 1)
			gender = Gender.FEMALE;
		else if (genderid == 2)
			gender = Gender.OTHERS;

		StudentDTO dto = new StudentDTO( std_name, gender, doj, contact);
		dto = studentService.registerStudent(dto);
		System.out.println("student registered succssfully with details : " + dto);
	}

}
