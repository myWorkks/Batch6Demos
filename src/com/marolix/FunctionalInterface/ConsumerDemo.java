package com.marolix.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Abc {

}

public class ConsumerDemo {
//	interface Consumer<T> {
//		void accept(T t);
//	}
	static List<Abc> abc = new ArrayList<Abc>();

	public static void main(String[] args) {
		Consumer<Integer> c = t -> {
			int a = (int) Math.pow(t, 8);
			System.out.println(a);
		};
		c.accept(10);
		Consumer<Abc> c2 = (Abc a) -> {

			abc.add(a);
			System.out.println(abc);
		};
		c2.accept(new Abc());
		c2.accept(new Abc());
	}

}
