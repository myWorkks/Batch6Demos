package com.marolix.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedDemo2 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		final List<Integer> sortedList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int a = (int) (Math.random() * 10);
			l.add(a);
		}
		System.out.println(l);
//default sorting order with Comparable interface
//		l.stream().sorted().forEach(i -> sortedList.add(i));
//customised sorting order	Comparator interface	
		// compare()

		Comparator<Integer> c = (x, y) -> {

			if (x % 2 == 0 && y % 2 == 0)
				return -1;
			else if (x % 2 == 1 && y % 2 == 1)
				return +1;
			else
				return 0;
		};
		l.stream().sorted(c).forEach(i -> sortedList.add(i));
		System.out.println(sortedList);
	}

}
