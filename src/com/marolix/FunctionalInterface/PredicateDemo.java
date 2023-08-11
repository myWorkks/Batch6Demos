package com.marolix.FunctionalInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo {
//Predicate<T>{
	// boolean test(T t)}
	public static void main(String[] args) {
		Predicate<Integer> p = t -> {
			if (t > 18) {
				return true;
			} else
				return false;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if (p.test(age)) {
			System.out.println("elgible for registarrtion");
		} else {
			System.out.println("not elgible for registration");
		}
	}

}
