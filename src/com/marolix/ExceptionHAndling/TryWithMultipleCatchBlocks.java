package com.marolix.ExceptionHAndling;

public class TryWithMultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			System.out.println(10.0/20.0);
			int[] a = { 1 };

			// a[1] = 10;// throw new ArrayIndexOutOfBound();

			System.out.println(10 / 0);// throw new ArithmeticException()

			Class.forName("bharath");

		}

//		catch (Throwable t) {
//		
//		
//		} 
		catch (Error e) {

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("kindly check the array size");

		}

		catch (ArithmeticException e) {

			System.out.println("Check whether ur denominator is greater than 0");

		}

		catch (ClassNotFoundException e) {

			System.out.println("kindly give fully qualified class name");
		} catch (Exception e) {

			System.out.println("unown exception occured");

		}
	}

}
