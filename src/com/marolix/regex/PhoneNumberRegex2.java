package com.marolix.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter phone number");
		String phoneNumber = sc.next();
		// "[0-9]{10}"
		if (phoneNumber.matches("[0-9]{10}")) {
			System.out.println("valid phone number  and number is " + phoneNumber);
		} else {
			System.out.println("in valid phone number");
		}
	}

}
