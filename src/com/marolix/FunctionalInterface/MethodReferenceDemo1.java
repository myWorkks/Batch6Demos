package com.marolix.FunctionalInterface;

interface FunctionalInterf {
	void fImethod();
}

class DemoForMethodReference {
	DemoForMethodReference() {
		System.out.println("this is for constructor reference");
	}

	public String m3() {
		System.out.println("m3");
		return null;
	}

	public int m4(int a) {
		System.out.println(a);
		return a;
	}

	public void m1() {
		System.out.println("this is the method which is already there");
	}

	public static void m2() {
		System.out.println("this is static method reference");
	}
}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		DemoForMethodReference d = new DemoForMethodReference();
		FunctionalInterf f = d::m3;
		f.fImethod();
		FunctionalInterf f2 = DemoForMethodReference::m2;
//		f2.fImethod();
		FunctionalInterf f22 = DemoForMethodReference::new;
		f22.fImethod();
	}

}
