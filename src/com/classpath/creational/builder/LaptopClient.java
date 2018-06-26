package com.classpath.creational.builder;

public class LaptopClient {

	public static void main(String[] args) {
		Laptop myPersonalLaptop = new Laptop.LaptopBuilder(32, 512, "Intel").fingerPrintReaderRequired(true).installOS("WINDOWS_10")
				.smartCardReaderInstalled(true).msOfficeequired(true).build();
		System.out.println(myPersonalLaptop.getOsName());
	}
}
