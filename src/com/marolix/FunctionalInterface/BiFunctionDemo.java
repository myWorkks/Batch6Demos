package com.marolix.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunctionDemo {
//BiFUnction<T ,U,V>{
//	V accept(T,U)
//}
	public static void main(String[] args) {

		BiFunction<Integer, List<Integer>, List<Integer>> bp = (Integer p, List<Integer> q) -> {
			q.add(p);
			return q;
		};

		Integer a = 10;
		List<Integer> l = new ArrayList<Integer>();
		int i = 1;
		while (i < 5) {
			l.add(i);
			i++;
		}
		System.out.println(l);
		List<Integer> ll = bp.apply(a, l);
		System.out.println(ll);

		System.out.println("------------------------");
		BinaryOperator<Integer> bo = (i1, j) -> i1 * j;
		System.out.println(bo.apply(2, 6));
	}

}
