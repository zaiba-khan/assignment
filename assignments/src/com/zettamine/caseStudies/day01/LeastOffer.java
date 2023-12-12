package com.zettamine.caseStudies.day01;

import java.util.Scanner;

public class LeastOffer {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter the number of items : ");
		int itemsNo = sc.nextInt();
		Items[] items = new Items[itemsNo];
		
		System.out.println("Enter item name,price,discount percentage :");
		
		for (int i = 0; i < itemsNo; i++) {
			String itemDetails = sc.next();
			String[] splitter = itemDetails.split(",");
			int discount = (int) (Integer.parseInt(splitter[1]) * Integer.parseInt(splitter[2]) * 0.01);
			items[i] = new Items(splitter[0],discount);
			
		}
		
		int minDisc = Integer.MAX_VALUE;
		for (int i = 0; i < itemsNo; i++) {
			if (items[i].getDiscount() <= minDisc) {
				minDisc = items[i].getDiscount();
				System.out.println(items[i].getItem());
			}
			
		}
		
	}

}
