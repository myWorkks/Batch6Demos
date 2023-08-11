package com.marolix.ExceptionHAndling;

class DivisionException extends Exception {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;

	public DivisionException(String s) {
		super(s);
	}

}

public class ThrowDEmo {

	public static void main(String[] args) throws Exception {
		int a = 10;
		int b = 0;

		if (b == 0) {

			throw new DivisionException("denominator cannot be zero.KIndly check the denominator");

		} else {
			System.out.println(a / b);
		}

	}

}
