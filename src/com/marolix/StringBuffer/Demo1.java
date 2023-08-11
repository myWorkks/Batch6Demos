package com.marolix.StringBuffer;

public class Demo1 {

	public static void main(String[] args) {
		
		
		
		String s=new String("bharath");
		String s2=s.toUpperCase();
		String s3=s2.toLowerCase();
		
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		StringBuffer sb = new StringBuffer(10);
		System.out.println(sb.capacity());
		sb.ensureCapacity(25
				);
		System.out.println(sb.capacity());
	}

}
