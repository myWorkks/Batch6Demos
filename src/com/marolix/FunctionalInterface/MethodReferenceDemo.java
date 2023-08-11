package com.marolix.FunctionalInterface;

public class MethodReferenceDemo {

	public static void main(String[] args) {
	Impl i=	new Impl();
		
		SwappingNumbers s=i::swapingNumbers;
		s.swapTwoNumbers();

	}

}
