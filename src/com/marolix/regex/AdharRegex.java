package com.marolix.regex;

import java.util.Scanner;

public class AdharRegex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.trim();
		System.out.println(s);
		System.out.println(s.matches("^[0-9]{4}([\\.][0-9]{4}){2}$"));

	}

}
