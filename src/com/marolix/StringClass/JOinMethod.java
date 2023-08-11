package com.marolix.StringClass;

public class JOinMethod {

	public static void main(String[] args) {
		String s1 = "Bharath";
		String s4="simha";
		String s2 = "Reddy";
		String s3 = s1 + "," + s2+","+s4;
		System.out.println(s3);

		// join(character,String... s)
		s3 = String.join(".", s1, s2,s4);
		System.out.println(s3);
	}

}
