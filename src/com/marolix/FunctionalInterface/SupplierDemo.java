package com.marolix.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// 0 1
		Supplier<Integer> s = () -> {
			String empty = "";
			for (int i = 0; i <= 3; i++) {
				empty += (int) (Math.random() * 10);
			}
			return Integer.parseInt(empty);

		};
		int d = s.get();

		System.out.println(d);
	}

}
