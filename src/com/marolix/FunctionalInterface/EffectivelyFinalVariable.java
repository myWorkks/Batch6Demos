package com.marolix.FunctionalInterface;

interface SwappingNumbers {

	void swapTwoNumbers();
}

class Impl {

	public void swapingNumbers() {
		int a, b, c;
		a = 10;
		b = 20;

		System.out.println(a + "  " + b);
//		c = a;
//		a = b;
//		b = c;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + "  " + b);
	}

}

public class EffectivelyFinalVariable {
	static int d = 20;

	public static void main(String[] args) {
		final int e = 10;
		SwappingNumbers s = () -> {

			System.out.println(d);

		};
		s.swapTwoNumbers();
		d = 10;

	}

}
