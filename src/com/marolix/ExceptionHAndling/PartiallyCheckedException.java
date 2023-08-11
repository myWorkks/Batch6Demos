package com.marolix.ExceptionHAndling;

public class PartiallyCheckedException {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(1);
			System.out.println("abc");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("after catch");

	}

}
