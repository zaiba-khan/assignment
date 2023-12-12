package com.zettamine.caseStudies.day01;

import java.util.Scanner;

public class DisplayCharacters {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 4 Numbers : ");
			int[] charArray = new int[4];
			
			for(int i=0;i<charArray.length;i++) {
				charArray[i] = sc.nextInt();
			}
			System.out.println("~".repeat(20));
			System.out.println("Output");
			System.out.println("~".repeat(20));
			
			
			for(int i=0;i<charArray.length;i++) {
				System.out.println(charArray[i] + "-"+(char)charArray[i]);
			}
		}
}
