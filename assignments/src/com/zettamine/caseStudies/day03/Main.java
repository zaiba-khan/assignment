package com.zettamine.caseStudies.day03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student st = hostellerDetails();
		System.out.println("=".repeat(20) + " STUDENT DATA " + "=".repeat(20));
		System.out.println("Student details are as follows : ");
		System.out.println(st.toString());
	}
	
	public static Student hostellerDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student details and hostel details : ");
		System.out.printf("Student ID : ");
		int studentId = sc.nextInt();
		System.out.printf("Student Name : ");
		String studentName = sc.nextLine();
		sc.nextLine();
		System.out.printf("Department Id : ");
		int departmentId =  sc.nextInt();
		sc.nextLine();
		System.out.printf("Gender : [M|F] : ");
		String gender = sc.next();
		sc.nextLine();
		System.out.printf("Phone number : ");
		long phone = sc.nextLong();
		sc.nextLine();
		System.out.printf("Hostel Name : ");
		String hostel = sc.nextLine();
//		sc.nextLine();
		System.out.printf("Room number : ");
		int roomNo = sc.nextInt();
		sc.nextLine();
		System.out.printf("Modify Room number (Y|N) : ");
		String response = sc.next();
			if(response.equalsIgnoreCase("Y")) {
				System.out.printf("New room Number : ");
				roomNo = sc.nextInt();
			}	
		System.out.printf("Modify Phone number (Y|N) : ");
		response = sc.next();
			if(response.equalsIgnoreCase("Y")) {
				System.out.println("New Phone Number : ");
			phone = sc.nextLong();
			}
			sc.close();
		Hosteller hosteller = new Hosteller(hostel,roomNo);	
		
		Student student = new Student(studentId,studentName,departmentId,gender,phone,hosteller);
		
		return student;
		
	}
}
