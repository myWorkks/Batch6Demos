package com.marolix.WrapperClasses;

public class AutoBoxing {
	static void display(int a) {

		System.out.println(a);
	}

	public static void main(String[] args) {
		Integer i = 10;// Integer i=Integer.valueOf(10);
		display(i);//i.intValue()
		
		Double d=10.0;
		
		String s="abc";
		String s1="abc";
		System.out.println(s==s1);
		Integer ii=10;
		Integer ii2=10;//==

		Integer iii=128;
		Integer iii2=128;
		System.out.println(iii==iii2);
		
	}

}
