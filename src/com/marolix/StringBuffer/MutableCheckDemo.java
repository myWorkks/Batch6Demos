package com.marolix.StringBuffer;

public class MutableCheckDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());

		System.out.println(sb + ":" + sb.hashCode());
		sb.append("appendedContent");
		System.out.println(sb + ":" + sb.hashCode());
		System.out.println("--------------------");
		String s = new String();
		System.out.println(s + ":" + s.hashCode());
		s=s.concat("contentCOncated");
		System.out.println(s + ":" + s.hashCode());

	}

}
