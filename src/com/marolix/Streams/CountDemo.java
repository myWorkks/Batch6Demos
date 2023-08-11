package com.marolix.Streams;

import java.util.ArrayList;
import java.util.List;

public class CountDemo {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			if (i < 5) {
				l.add(1);

			} else
				l.add(i);
		}
		System.out.println(l);
		List<Integer> uniqueList = new ArrayList<Integer>();

		long ll = l.stream().distinct().count();

		System.out.println(ll);
	}

}
