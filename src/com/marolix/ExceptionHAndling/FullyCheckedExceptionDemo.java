package com.marolix.ExceptionHAndling;

import java.io.FileNotFoundException;

public class FullyCheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			
			System.out.println(1);
			System.out.println("abc");
		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("after catch");

	}

}
