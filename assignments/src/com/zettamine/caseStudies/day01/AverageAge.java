package com.zettamine.caseStudies.day01;

import java.util.Scanner;

public class AverageAge {
	
	static Scanner sc = new Scanner(System.in);
	static boolean flag = false;
	
	public static void main(String[] args) {
		 
		System.out.println("Please enter total no. of employees");
		int[] age = new int[sc.nextInt()];
		float avg = 0;
		
		if(age.length<2 || age.length>40) 
			System.err.println("Please enter a valid employee count");
		else
			 avg = calculateAverage(age);
		if(!flag)
			System.out.printf("The average age is %.2f", avg);
	}
	
	public static float calculateAverage(int[] age) {
		float avg = 0;
		int total = 0;
		System.out.println("Enter the age for "+ age.length + " employees :");
			for(int i=0;i<age.length;i++) {	
				age[i] = sc.nextInt();
				if(age[i] <28 || age[i] > 40) {
					System.err.println("Invalid age encountered!");
					flag = true;
					break;
				}
				total +=age[i];
		}
			avg = (float)total/age.length;	
		return avg;
	}

}
