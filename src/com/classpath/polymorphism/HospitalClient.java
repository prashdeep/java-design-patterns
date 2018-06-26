package com.classpath.polymorphism;

import java.util.Scanner;

public class HospitalClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1: Ortho");
		System.out.println("2: Padietric");
		int option = sc.nextInt();
		Doctor doctor = null;
		if (option == 1) {
			doctor = new Ortho();
		} else {
			doctor = new Padietric();
		}
		doctor.treatPatient();
		sc.close();

	}

}
