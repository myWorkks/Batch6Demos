package com.marolix.dateAndtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormats {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now().minusDays(11);
		System.out.println(d);

		// a,m,h,H,M,y,Y,w,W
		String s = d.format(DateTimeFormatter.ofPattern("d'/'M'/'y"));
		String s1 = d.format(DateTimeFormatter.ofPattern("d'/'MM'/'y"));
		String s2 = d.format(DateTimeFormatter.ofPattern("d'/'MMM'/'y"));
		String s3 = d.format(DateTimeFormatter.ofPattern("dd'/'MMMM'/'yy','EEEE"));
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
