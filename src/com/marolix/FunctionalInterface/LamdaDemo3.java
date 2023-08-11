package com.marolix.FunctionalInterface;

interface Test {

	Integer countCharacters(String s);
}

public class LamdaDemo3 {

	public static void main(String[] args) {
		Test t = s -> {
			int count = 0;
			char[] ch = s.toCharArray();
			for (Character c : ch) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					count++;
			}
			return count;
		};
		int a = t.countCharacters("bharath");
		System.out.println(a);
	}

}
