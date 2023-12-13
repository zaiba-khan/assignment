package com.zettamine.caseStudies.day05;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.util.Scanner;

public class ProductInventory{

	private static final String filePath = "D:\\DJava\\Java\\stocks.ser";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Writer file = new FileWriter(filePath);
			
			System.out.printf("Enter no of Products to be saved : ");
			int noOfProducts = sc.nextInt();
			sc.nextLine();
			
			Product[] prod = new Product[noOfProducts];
			
			for(int i=0;i<noOfProducts;i++) {
				System.out.println("enter product id and product name of product " + (i+1) + " : ");
				Product p = new Product(sc.nextInt(),sc.nextLine());
				prod[i] = p;
			}
			serializableFile(prod);
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public static void serializableFile(Product[] prod) {
		FileOutputStream fs;
		ObjectOutputStream os;
		
		try {
			fs = new FileOutputStream(filePath);
			os = new ObjectOutputStream(fs);
			os.writeObject(prod);
			System.out.println("Product details have been entered ");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
