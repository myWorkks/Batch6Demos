package com.marolix.FunctionalInterface;

import java.util.function.BiPredicate;

class Company1 {
	public Integer noOfEmployees;
	public Double turnOver;
	public String name;

	public Company1(Integer noOfEmployees, Double turnOver) {
		super();
		this.noOfEmployees = noOfEmployees;
		this.turnOver = turnOver;
	}

}

class Company2 {
	public String name;
	public Integer noOfEmployees;
	public Double turnOver;

	public Company2(Integer noOfEmployees, Double turnOver) {
		super();
		this.noOfEmployees = noOfEmployees;
		this.turnOver = turnOver;
	}

}

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<Company1, Company2> bp = (a, b) -> {
			double avg1 = a.turnOver / a.noOfEmployees;
			double avg2 = b.turnOver / b.noOfEmployees;
			return avg1 > avg2;

		};
		Company1 c1 = new Company1(100, 70000000.0);
		c1.name = "Marolix";
		Company2 c2 = new Company2(17, 500000.0);
		c2.name = "Viper";
		boolean b = bp.test(c1, c2);
		if (b) {
			System.out.println(c1.name + " turnover is greater than " + c2.name);
		}
		else
		System.out.println(c2.name + " turnover is greater than " + c1.name);
	}

}
