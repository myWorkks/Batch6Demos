package com.marolix.StringBuffer;

public class StringBufferObject {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		System.out.println("--------------");
		StringBuffer sb1= new StringBuffer(50);
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println("--------------");
		StringBuffer sb2= new StringBuffer("Bharath");
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println("--------------");
		CharSequence c = new String("abc");
		StringBuffer sb3= new StringBuffer(c);
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
	}

}
