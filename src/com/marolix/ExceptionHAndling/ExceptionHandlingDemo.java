package com.marolix.ExceptionHAndling;

public class ExceptionHandlingDemo {
	public static void display() {

		System.out.println("display called");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println("I am trying to divide a number with 0");
		//System.out.println(10 / 0);
		try {
			Class.forName("java.lang.Excepti");
			
		}
		
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("after exception");
	
		display();
	}

}
