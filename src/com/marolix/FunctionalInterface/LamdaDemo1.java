package com.marolix.FunctionalInterface;

interface Lamda1 {

	void m1();

	default void m2() {
		System.out.println("this is default method in interface");
	}

}

public class LamdaDemo1 {

	public static void main(String[] args) {

		Lamda1 l = () -> {

			System.out.println("this is imlementation of interface using lamda");
		};
		l.m1();
		l.m2();

	}

}
