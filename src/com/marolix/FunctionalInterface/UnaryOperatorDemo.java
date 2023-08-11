package com.marolix.FunctionalInterface;

import java.util.function.UnaryOperator;

class Emp {
	Integer id;
	String phoneNumber;

	public Emp(Integer id, String phoneNumber) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", phoneNumber=" + phoneNumber + "]";
	}

}

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		UnaryOperator<String> u = s -> s.substring(2);
		System.out.println(u.apply("abcdef"));
		UnaryOperator<Emp> u2 = employee -> {
			employee.phoneNumber = "7897897894";
			return employee;
		};
		Emp e= new Emp(1, "9063388012");
		System.out.println(e);
		System.out.println(u2.apply(e));
	}

}
