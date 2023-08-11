package com.marolix.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationDemo {

	public static void main(String[] args) {
		// String System ="abc";
//		System.out.println(System);
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			l.add(i);

		System.out.println(l);

		Stream<Integer> s = l.stream();
		Stream<Integer> ps = l.parallelStream();
		// System.out.println(s);
		// s = s.unordered();
		s.forEach(System.out::print);
		System.out.println();
		// ps = ps.unordered();
		ps.forEach(System.out::print);

	}

}
