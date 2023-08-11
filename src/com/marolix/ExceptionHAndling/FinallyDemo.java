package com.marolix.ExceptionHAndling;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println("creating an exception");
		if (args.length == 0) {
			try {
				throw new RuntimeException("wantedly created exception");
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("thi sis finally block");
			}
		}
		System.out.println("exception not ocuured");

	}

}
