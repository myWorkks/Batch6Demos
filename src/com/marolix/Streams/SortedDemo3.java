package com.marolix.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortedDemo3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> sortedlist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the para");
		String s = sc.nextLine().trim();
		String[] ss = s.split(" ");
		for (String s1 : ss) {
			if (!s1.equals("")) {
				list.add(s1);
			}
		}
		System.out.println(list);
		Comparator<String> cc = (x, y) -> {

			return x.toLowerCase().compareTo(y.toLowerCase());
		};
		list.stream().sorted(cc).forEach(s2 -> sortedlist.add(s2));
		System.out.println(sortedlist);

	}

}
