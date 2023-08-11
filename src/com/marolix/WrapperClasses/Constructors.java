package com.marolix.WrapperClasses;

import java.lang.reflect.Constructor;

public class Constructors {

	public static void main(String[] args) throws ClassNotFoundException {
		int i = 0;
		Class c = Class.forName("java.lang.Character");
		Constructor[] cc = c.getConstructors();
		for (Constructor ccc : cc) {
			System.out.println(++i + ":" + ccc);
		}

		Integer ii = new Integer(10);
		Integer i1 = new Integer("10");
		//Integer i2 = new Integer("ten");//Exception

		
		
		Boolean b= new Boolean(true);
		Boolean b1=new Boolean("true");
		Boolean b2= new Boolean("True");
		Boolean b3= new Boolean("bharath");
		System.out.println(b +" "+b1+" "+b2+" "+b3);
//		Boolean b3= new Boo
	}

}
