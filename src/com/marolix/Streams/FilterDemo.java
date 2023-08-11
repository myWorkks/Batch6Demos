package com.marolix.Streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MarolixEmployees {
	Integer empId;
	String empName;
	LocalDate doj;

	@Override
	public String toString() {
		return "MarolixEmployees [empId=" + empId + ", empName=" + empName + ", doj=" + doj + "]";
	}

	public MarolixEmployees(Integer empId, String empName, LocalDate doj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.doj = doj;
	}

	public MarolixEmployees(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

}

public class FilterDemo {

	public static void filterEmployees() {
		List<MarolixEmployees> l = new ArrayList<MarolixEmployees>();

		l.add(new MarolixEmployees(1, "bharath", LocalDate.of(2023, 3, 20)));
		l.add(new MarolixEmployees(2, "praveen", LocalDate.of(2023, 5, 10)));
		l.add(new MarolixEmployees(3, "Narendra", LocalDate.of(2023, 5, 10)));
		l.add(new MarolixEmployees(4, "Vanaja", LocalDate.of(2023, 3, 24)));
		l.add(new MarolixEmployees(5, "pankaj", LocalDate.of(2023, 4, 13)));
		l.add(new MarolixEmployees(6, "sushmitha", LocalDate.of(2023, 4, 26)));
		l.add(new MarolixEmployees(7, "udayashree", LocalDate.of(2023, 4, 12)));
		l.add(new MarolixEmployees(8, "ramesh", LocalDate.of(2023, 3, 24)));
		System.out.println(l);
		Stream<MarolixEmployees> empStream = l.stream();
		empStream = empStream.filter(emp -> emp.doj.isAfter(LocalDate.of(2023, 4, 15)));
		Stream<MarolixEmployees> empIdStream = empStream.map(emp -> new MarolixEmployees(emp.empId, emp.empName));
		empIdStream.forEach(System.out::println);
	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);

		Stream<Integer> intStream = l.stream().filter(t -> {
			System.out.println(t);
			return t % 2 == 0;
		});
		intStream.forEach(p -> {
			System.out.println(p);
		});

		List<String> stringList = new ArrayList<String>();
		String s = "I am bharath. I am a software developer";
		String ss[] = s.split(" ");
		for (String string : ss) {
			stringList.add(string);
		}
		System.out.println(stringList);
		Stream<String> stringSTream = stringList.stream();

		stringSTream = stringSTream.map(s1 -> s1.toLowerCase()).filter(t -> t.length() == 1);
		stringSTream.forEach(System.out::println);
		System.out.println("---------------");
		filterEmployees();
	}

}
