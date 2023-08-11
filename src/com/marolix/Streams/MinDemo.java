package com.marolix.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MinDemo {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		final List<Integer> sortedList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int a = (int) (Math.random() * 10);
			l.add(a);
		}
		System.out.println(l);
		Optional<Integer> o = l.stream().min((x, y) -> -x.compareTo(y));
		if (o.isPresent()) {
			int a = o.get();
			System.out.println(a);
		}

	}

}
