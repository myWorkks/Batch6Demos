package com.marolix.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	Integer empId;
	List<String> phoneNumbers;

	public Employee(Integer empId, List<String> phoneNumbers) {
		super();
		this.empId = empId;
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", phoneNumbers=" + phoneNumbers + "]";
	}

}

public class FlatMapDemo {

	public static void flatMapWithEmployee() {

		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(1, Arrays.asList("9063388012", "9603607878")));
		l.add(new Employee(2, Arrays.asList("9789789784", "7418529630")));

//		List<List<String>> ss = l.stream().map(t -> t.phoneNumbers).collect(Collectors.toList());
		List<String> ss = l.stream().flatMap(t -> t.phoneNumbers.stream()).collect(Collectors.toList());
		System.out.println(ss);
	}

	public static void main(String[] args) {
		flatMapWithEmployee();
		Thread.currentThread().stop();
		List<List<Integer>> twoD = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(3, 4, 5),
				Arrays.asList(6, 7, 8));
		System.out.println(twoD);

//		 twoD.stream().map(t -> t).collect(Collectors.toList());
		List<Integer> oneD = twoD.stream().flatMap(t -> t.stream()).collect(Collectors.toList());
		System.out.println(oneD);
	}

}
