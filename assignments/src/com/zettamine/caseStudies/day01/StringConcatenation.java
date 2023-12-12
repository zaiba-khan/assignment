package com.zettamine.caseStudies.day01;

import java.util.Scanner;

public class StringConcatenation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String allowedName = "^[A-Za-z\\s]+$";
		String name = "";
		
		System.out.printf("Inmate's name :");
		name = sc.nextLine();
		
		System.out.printf("Inmate's father's name :");
		name = name.concat(sc.nextLine());
		
		if(!name.matches(allowedName)) {
			System.err.println("Invalid name");
		}
		else {
			System.out.println(name.toUpperCase());
		}
		
	}
	
	
}
