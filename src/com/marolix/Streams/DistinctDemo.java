package com.marolix.Streams;

import java.util.ArrayList;
import java.util.List;

public class DistinctDemo {

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
//		for (int i = 0; i < l.size(); i++) {
//			for (int j = i + 1; j < l.size(); j++) {
//				if (l.get(i).equals(l.get(j))) {
//					break;
//				} else
//					uniqueList.add(l.get(i));
//
//			}
//
//		}
		l.stream().distinct().forEach(l1 -> uniqueList.add(l1));
		;
		System.out.println(uniqueList);
	}

}
