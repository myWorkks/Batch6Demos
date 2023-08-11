package com.marolix.StringClass;

public class CompareOfStrings {

	public static void main(String[] args) {
		String s = "abc";
		String s2 = "pqr";
		
		
		String s3="a";
		String s4="Abc";
		System.out.println(s.equals(s2));
		// equalsIgnoreCase
		System.out.println(s.equalsIgnoreCase(s2));
		
		//s.compareTo(s2)
		//Comparable->compareTo() boolean +ve,-ve,0
		//Comparator
System.out.println(s.compareTo(s2));
System.out.println(s.compareTo(s3));
System.out.println(s.compareTo(s4));//0



	}

}
