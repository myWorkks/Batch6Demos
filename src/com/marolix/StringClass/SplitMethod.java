package com.marolix.StringClass;

public class SplitMethod {

	public static void main(String[] args) {
		// Bharath Simha reddy

		String s = "This is an example string for the split method.Hope i will be useful";
		String s1[] = s.split("e");
		for (String string : s1) {
			System.out.println(string);
		}
	}

}
