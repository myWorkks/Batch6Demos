package com.marolix.FunctionalInterface;

@FunctionalInterface
interface Aaa {
	void m1();
}

public class LamdasAsParameter {
	void m2(Aaa a) {
		System.out.println(a);
	}
	void m3(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		LamdasAsParameter ll = new LamdasAsParameter();
//		class An implements Aaa {
//		}
//		Aaa a = new Aaa() {
//
//			@Override
//			public void m1() {
//				// TODO Auto-generated method stub
//
//			}
//		};
//		Aaa a = () -> {
//		};
		
		ll.m3(10);
		int b=10;
		ll.m3(b);
		ll.m2(() -> {
		});

	}

}
