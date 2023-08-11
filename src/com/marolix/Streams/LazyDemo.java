package com.marolix.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Empl {
	Integer empId;
	String name;
	String phone;

	@Override
	public String toString() {
		return "Empl [empId=" + empId + ", name=" + name + ", phone=" + phone + "]";
	}

	public Empl(Integer empId, String name, String phone) {
		super();
		this.empId = empId;
		this.name = name;
		this.phone = phone;
	}

}

public class LazyDemo {

	public static void main(String[] args) {
		List<Empl> l = new ArrayList<Empl>();
		l.add(new Empl(1, "bharath", "9063388012"));
		l.add(new Empl(2, "Sharath", "4567891237"));
		l.add(new Empl(3, "Ramesh", "7894561237"));
		l.add(new Empl(4, "suresh", "1478523691"));
		System.out.println(l);
		Stream<Empl> stream = l.stream();

		Stream<String> s = stream.map(e -> {
			System.out.println(e);
			return e.phone;
		});

		s.forEach(p -> {
			System.out.println(p);
		});
		long length = s.count();
		System.out.println(length);

		System.out.println("after stream");
//		List<Integer> l = new ArrayList<Integer>();
//		for (int i = 0; i < 10; i++) {
//			l.add(i);
//		}
//		Stream<Integer> s = l.stream();
//		
//		
//		s = s.map(p -> {
//			System.out.println(p);
//			return p * p;
//		});
//
//		
//		
//		s.forEach(System.out::println);

	}

}
