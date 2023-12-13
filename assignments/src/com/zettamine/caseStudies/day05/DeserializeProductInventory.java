package com.zettamine.caseStudies.day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeProductInventory {

	private static final String filePath = "D:\\DJava\\Java\\stocks.ser";

	public static void main(String[] args) {
		FileInputStream fi;
		ObjectInputStream oi;

		Product[] prod;

		try {
			fi = new FileInputStream(filePath);
			oi = new ObjectInputStream(fi);

			
			prod = (Product[]) oi.readObject();

			oi.close();
			fi.close();

			System.out.println("file has been deserialized ");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
