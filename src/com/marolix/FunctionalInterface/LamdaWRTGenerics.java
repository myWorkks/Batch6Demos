package com.marolix.FunctionalInterface;

interface Aa <T>{
	T display(T s);
}

//interface Ba {
//	Integer display(Integer s);
//}

public class LamdaWRTGenerics {

	public static void main(String[] args) {
		Aa<String> a = s -> s;

		String s = a.display("abc");
		System.out.println(s);

		Aa<Integer> b = s1 -> s1;
		int aa = b.display(1);
		System.out.println(aa);
		Aa<Character> c=s2->s2;
		c.display('c');
		

	}

}
