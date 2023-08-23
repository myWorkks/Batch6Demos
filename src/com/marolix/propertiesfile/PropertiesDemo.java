package com.marolix.propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void readDBcredentials() {

		Properties p = new Properties();
		File f = new File("G:\\MyWorks\\eclispe_programs\\Sessions\\MarolixSet6\\src\\ExtraFiles\\app.properties");

		try (FileInputStream fis = new FileInputStream(f);) {

			p.load(fis);
			String s = p.getProperty("db_url");
			System.out.println(s);
			System.out.println(p.getProperty("user_name"));
			// url=s;
			// password=pwd;
			// user_name=user;
			p.setProperty("password", "root");
			FileOutputStream fos = new FileOutputStream(f);
			p.store(fos, "writen by bharath");
		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}

	public static void write() throws IOException {
		Properties p = new Properties();
		p.setProperty("password", "root");
		File f = new File("G:\\MyWorks\\eclispe_programs\\Sessions\\MarolixSet6\\src\\ExtraFiles\\app.properties");
		FileOutputStream fos = new FileOutputStream(f);
		p.store(fos, "writen by bharath");

	}

	public static void main(String[] args) throws IOException {
	 readDBcredentials();
		//write();
	}

}
