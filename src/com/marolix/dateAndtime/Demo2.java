package com.marolix.dateAndtime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Demo2 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		LocalDate d2 = d.plusWeeks(70);
		long a = ChronoUnit.YEARS.between(d, d2);
		long a1 = ChronoUnit.DAYS.between(d, d2);
		Long a2 = ChronoUnit.MONTHS.between(d, d2);
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);

	}

}
