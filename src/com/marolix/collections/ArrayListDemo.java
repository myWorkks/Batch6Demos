package com.marolix.collections;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {

	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<Integer>();
		Collection<Integer> c1=new ArrayList<Integer>();
		System.out.println(c);
		c.add(1);
		c.add(2);
		c.add(3);
		System.out.println(c);//1,2,3
//		c.remove(3);
	
		System.out.println(c.size());//3
//		c.clear();
		
		c1.addAll(c);//1,2,3
		c1.remove(3);//1,2
		c.removeAll(c1);

//		
System.out.println(c1+" c1 elements");
	}

}
