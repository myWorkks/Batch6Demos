package com.marolix.ExceptionHAndling;

import java.util.Scanner;

public class Demo1 {

	public static int doAddition(int a, int b) {

		int sum = 0;
		System.out.println("addition method is called");
		sum = a + b;
		System.out.println("add value " + sum);
		return sum;
	}

	public static int doMultiplication(int a, int b) {
		System.out.println("multiplication method called");
		System.out.println("multipliy value " + a * b);
		return a * b;
	}

	public static int doDivision(int a, int b) {
		System.out.println("a is " + a + ": b is" + b);
		System.out.println("division method called");

		int c = 0;
		try {
			return b / a;
		} catch (Exception e) {
			System.out.println("something went wrong");
			return c;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 nums");
		int a = doAddition(sc.nextInt(), sc.nextInt());
		System.out.println("enter 1 number");
		int b = doMultiplication(a, sc.nextInt());
		System.out.println("enter 1 number");
		int c = doDivision(b, sc.nextInt());
		System.out.println("final result is " + c);

		sc.close();
	}

}
