package com.marolix.dateAndtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo1 {

	public static void main(String[] args) {
		// generating todays date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime daeAndTime = LocalDateTime.now();
		System.out.println(daeAndTime);

		// specific date
		LocalDate specificDate = LocalDate.of(2021,7,19);
		System.out.println(specificDate);
		System.out.println(date.minusYears(18));
		System.out.println(date.plusDays(5));
		if(date.minusYears(18).isAfter(specificDate)) {
			System.out.println("you are elgible for the registration");
		}
		else {
			System.out.println("try after 18 years");
		}
		

	}

}
