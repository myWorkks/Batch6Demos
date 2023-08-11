package com.marolix.StringBuffer;

public class Methods {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("I am String Buffer Object with String instance");
		char ch = sb.charAt(10);
		System.out.println(ch);

		char[] ch1 = new char[50];

		sb.getChars(0, 10, ch1, 5);
		System.out.println(ch1);
		sb.append(false);
		System.out.println(sb);

		sb.setCharAt(10, 'G');
		System.out.println(sb);

		sb.insert(10, "string");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		sb.delete(0, 10);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);

		// sb.ensureCapacity(15);

		System.out.println(sb.capacity());
		sb.ensureCapacity(129);// 2*cc+2<=ensurevalue|2*cc+2
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		sb.setLength(50);
		System.out.println(sb);

	}

}
