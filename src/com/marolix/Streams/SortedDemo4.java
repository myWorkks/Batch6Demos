package com.marolix.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Bike implements Comparable<Bike> {
	String name;
	Double capacity;

	public Bike(String name, Double capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", capacity=" + capacity + "]";
	}

	@Override
	public int compareTo(Bike o) {
		return this.capacity.compareTo(o.capacity);

	}

}

public class SortedDemo4 {
	public static void main(String[] args) {
		List<Bike> bikeList = new ArrayList<Bike>();
		List<Bike> sortedbikeList = new ArrayList<Bike>();
		bikeList.add(new Bike("duke", 300.0));

		bikeList.add(new Bike("Dominar", 400.0));
		bikeList.add(new Bike("pulasar", 120.0));
		bikeList.add(new Bike("ns", 200.0));
		bikeList.add(new Bike("RE", 350.0));
		;
		System.out.println(bikeList);
		Comparator<Bike> c = (x, y) -> {
			return -x.name.compareTo(y.name);
		};
		bikeList.stream().sorted(c).forEach(x -> sortedbikeList.add(x));
		// Arrays.sort(bikeList.toArray());
		// Comparable<Bike>
		System.out.println(sortedbikeList);
	}
}
