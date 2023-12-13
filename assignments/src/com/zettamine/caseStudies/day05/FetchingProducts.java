package com.zettamine.caseStudies.day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class FetchingProducts {

	public static void main(String[] args) {
		FileInputStream fi;
		ObjectInputStream oi;

		Product[] prod;

		try {
			fi = new FileInputStream("D:\\DJava\\Java\\stocks.ser");
			oi = new ObjectInputStream(fi);
			boolean flag = false;

			Scanner sc = new Scanner(System.in);
			System.out.printf("Enter product id : ");
			int prodId = sc.nextInt();
			prod = (Product[]) oi.readObject();

			for (int i = 0; i < prod.length; i++) {
				if (prodId == prod[i].getProdId()) {
					System.out.println("Product present for the given product id is :"+ prod[i].getProdName());
					flag = true;
				}
			}

			if (flag == false)
				System.err.println("No product available with product id : " + prodId);

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.err.println("File is not present, please create file 'stocks.ser' ");
		} catch (IOException e) {
			System.err.println("No product is available in stock");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
