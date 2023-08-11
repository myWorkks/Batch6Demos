package com.marolix.FunctionalInterface;

public interface LamdaDemo2 {
	String reverseString(String s);
}

class Dummy implements LamdaDemo2 {

	@Override
	public String reverseString(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		// LamdaDemo2 ld = new Dummy();
		LamdaDemo2 ld =

				(String s) -> {
					StringBuffer sb = new StringBuffer(s);
					sb.reverse();
					return sb.toString();
				};

		String s = ld.reverseString("bharath");
		System.out.println(s);
	}
}
