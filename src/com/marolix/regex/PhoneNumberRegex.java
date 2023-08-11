package com.marolix.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex {

	public static void main(String[] args) {
		// 10
		// all are digits
		Scanner sc = new Scanner(System.in);
		System.out.println("enter phone number");
		String phoneNumber = sc.next();
		Pattern p = Pattern.compile(
				"[0-9]{10}");
		Matcher m = p.matcher(phoneNumber);
		if (m.matches()) {

			System.out.println("phone number is " + m.group());

		} else {

			System.out.println("it is not a valid number");
		}
	}

}
