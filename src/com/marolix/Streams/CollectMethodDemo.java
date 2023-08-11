package com.marolix.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectMethodDemo {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			if (i < 5) {
				l.add(1);

			} else
				l.add(i);
		}
		System.out.println(l);
		Set<Integer> uniqueList = new TreeSet<Integer>();

//		uniqueList = l.stream().collect(Collectors.toSet());

		List<String> ss = Arrays.asList("bharath", "reddy","n");
		String ssss = ss.stream().collect(Collectors.joining(" "));
		System.out.println(ssss);

	}

}
