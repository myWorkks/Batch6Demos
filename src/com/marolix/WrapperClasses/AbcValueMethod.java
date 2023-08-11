package com.marolix.WrapperClasses;

public class AbcValueMethod {

	public static void main(String[] args) {
		// Integer i = Integer.valueOf("32000");
		Double i = Double.valueOf("32000000.0");
		int i1 = i.intValue();
		byte i2 = i.byteValue();
		double d = i.doubleValue();
		long l = i.longValue();
		float f = i.floatValue();
		short s = i.shortValue();

		System.out.println(i1 + " " + i2 + " " + d + " " + l + " " + f + " " + s);
	
	
	// to convert wrapper object to primitive abcValue()
		
	}

}
