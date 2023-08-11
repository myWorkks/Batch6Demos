package com.marolix.FunctionalInterface;

import java.util.function.Function;

public class FuctionDemo {
//FUnction<T,R>{
//	R apply(T t)}
	public static void main(String[] args) {
		Function<Integer, Integer> f = (Integer i) -> {

			int fact = 1;
			while (i > 0) {
				fact *= i;
				i--;
			}
			return fact;
		};
		int fact = f.apply(1);
		System.out.println(fact);

		Function<String, Integer> ff = s -> s.length();

		System.out.println(ff.apply("Bharath"));

	}

}
