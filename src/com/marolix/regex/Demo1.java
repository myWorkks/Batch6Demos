package com.marolix.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z]");
		String s = "I am BHaratth. I tt ttt am a java trainer.";
		Matcher m = p.matcher(s);
//		Matcher m1 = p.matcher(s);
		//boolean matches()
		// boolean find()
		//int start()
		//int end()
		//group()
	System.out.println(m.matches());
//System.out.println(m.find());
	int i =0;
	while(m.find()) {
		System.out.println(m.start()+" "+m.group());
		//System.out.println(m.end());
		
		
	}
	
	}

}
