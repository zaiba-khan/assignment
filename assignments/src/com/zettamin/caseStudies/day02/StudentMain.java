package com.zettamin.caseStudies.day02;

import java.util.Scanner;

public class StudentMain {

	public static final String YES="yes";
	public static final String NO="no";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDetails s;
		System.out.printf("Enter student's ID :");
		int id = sc.nextInt();
		System.out.printf("Enter student's Name :");
		String name = sc.next();
		System.out.printf("Enter student's address :");
		String add = sc.next();
		System.out.printf("Does the student belong to NIT? [Yes|No] : ");
		String response = sc.next();
		
			if(response.equalsIgnoreCase(NO)) {
				System.out.printf("Enter College name : ");
				String college = sc.next();
				s = new StudentDetails(id, name, add, college);
				System.out.println("=".repeat(10) + " STUDENT DETAILS " + "=".repeat(10));
				System.out.println(s);
			}else if(response.equalsIgnoreCase(YES)) {
				System.out.println("=".repeat(10) + " STUDENT DETAILS " + "=".repeat(10));
				s = new StudentDetails(id, name, add, "NIT");
				System.out.println(s);
			}else {
				System.out.println("-----Wrong Input------");
			}

	}
}
