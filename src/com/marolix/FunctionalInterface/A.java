package com.marolix.FunctionalInterface;

public interface A {
	void m1();

	void m2();
}

class B  {

	

	public void m1() {
		System.out.println("thi si sm1");

	}

	
	public void m2() {
		System.out.println("this is m2");

	}

	public static void main(String[] args) {
		A a= new A() {
			
		

			public void m1() {
				System.out.println("thi si sm1");

			}

			
			public void m2() {
				System.out.println("this is m2");

			}
		};
		a.m1();
	}

}
