package com.zettamine.caseStudies.day05;

import java.io.File;
import java.io.IOException;

public class DirectoryDemo {

	private static final String path = "D:\\DJava";

	public static void main(String[] args) throws IOException {
		File parentDir = new File(path);

		if (!parentDir.exists()) {
			parentDir.mkdir();
			System.out.println("Parent folder DJava created");
			File subDir = new File("D:\\DJava\\Java");
			subDir.mkdir();
			System.out.println("Sub folder Java created");
		} else {
			File subDir = new File("D:\\DJava\\Java");
			subDir.mkdir();
			System.out.println("Sub folder Java created");
		}

		File file = new File("D:\\DJava\\Java\\Java.txt");
		if (!file.exists())
			file.createNewFile();
		System.out.println("File created : " + file.getName());
	}

}
