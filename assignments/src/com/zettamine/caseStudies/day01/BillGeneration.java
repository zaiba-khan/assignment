package com.zettamine.caseStudies.day01;

import java.util.Scanner;

public class BillGeneration {
		
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		 int noOfPizzas = 0;
		 int noOfPuffs = 0;
		 int noOfColdDrinks = 0;
		 
		 orderContents(noOfPizzas, noOfPuffs, noOfColdDrinks);
		 
		
	}

	public static void orderContents(int pizza, int puffs, int coldDrinks) {
		System.out.print("Please enter the no of Pizzas bought : ");
		pizza=sc.nextInt();
		
		System.out.print("Please enter the no of puffs bought : ");
		puffs=sc.nextInt();
		
		System.out.print("Please enter the no of cold drinks bought : ");
		coldDrinks=sc.nextInt();
		
		System.out.println("~".repeat(45));
		
		generateBill(pizza, puffs, coldDrinks);
				
	}
	
	public static void generateBill(int pizza, int puffs, int coldDrinks) {
		int pizzaCost = 100;
		int puffCost = 20;
		int coldDrinksCost = 10;
		
		int pizzaAmt = pizza * pizzaCost;
		int puffAmt = puffs * puffCost;
		int coldDrinkAmt = coldDrinks * coldDrinksCost;
		
		System.out.println(" Bill Details");
		System.out.println("~".repeat(45));
		System.out.println(" No of Pizzas :      " + pizza + "        Cost : " + pizzaAmt);
		System.out.println(" No of Puffs  :      " + puffs + "        Cost :  " + puffAmt);
		System.out.println(" No of Cold Drinks :  " + coldDrinks + "        Cost :   " + coldDrinkAmt);
		
		float total = pizzaAmt + puffAmt + coldDrinkAmt; 
		System.out.println();
		System.out.println("~".repeat(45));
		System.out.println(" Total Price = " + total);
		System.out.println();
		System.out.println(" ENJOY THE SHOW!!!");
	}
}
