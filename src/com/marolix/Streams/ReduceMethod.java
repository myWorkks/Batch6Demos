package com.marolix.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

public class ReduceMethod {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			l.add(i);
		}
		System.out.println(l);
		Optional<Integer> a1 = l.stream().reduce((a, b) -> a + b);
		if (a1.isPresent()) {
			int a = a1.get();
			System.out.println(a);
		} else {
			System.out.println("list is empty");
		}

		Integer i = l.stream().reduce(1, (a, b) -> a * b);
		System.out.println(i);

//		l.parallelStream().reduce(0, (l1, t) -> l1 + t
//
//				, (t, t1) -> t * t1);
		
		//a*(b*c)=(a*b)*c
	}

}
