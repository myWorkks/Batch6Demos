package com.marolix.collections;

public class GenericsDemo<T>{

	public void m1(T a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		int String=1;
		GenericsDemo<Integer> gd= new GenericsDemo();
		
		gd.m1(1);
		
	}

}
