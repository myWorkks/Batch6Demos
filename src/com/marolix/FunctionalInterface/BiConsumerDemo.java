package com.marolix.FunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<String, String> bc = (s1, s2) -> {
			s1 = s1.concat(s2);
			System.out.println(s1);
		};
		bc.accept("abc", "pqr");

	}

}
