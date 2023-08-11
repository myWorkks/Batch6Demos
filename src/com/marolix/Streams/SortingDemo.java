package com.marolix.Streams;

import java.util.Arrays;
import java.util.Comparator;

public class SortingDemo {

	public static void main(String[] args) {
		String s[] = { "ajbdbvjbdjfvbwdjhvbjhwbjhwbvbfhb", "pqr", "xyzhvdsghfvhgsdhgd", "Abc", "apple", "zy" };

		// java.util Arrays
		// sorting
		// searching

		// .compare(Str1,String2)
		Comparator<String> s1=Comparator.naturalOrder();
		Comparator<String> c = (x, y) -> {
			int s1L = x.length();
			int s2L = y.length();

			if (s1L > s2L) {
				return +45;
			} else if (s1L < s2L) {
				return -12;
			} else {
				return 0;
			}

		};
		// Arrays.sort(s);
		Arrays.sort(s, s1);
		for (String ss : s) {
			System.out.println(ss);
		}
	}

}
