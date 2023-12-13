package com.zettamine.caseStudies.day05;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		File file = new File("src/com/zettamine/caseStudies/day01");
		System.out.println("does file exists : "  + file.exists());
		if(file.exists())
			System.out.println("file name : " + file.getName());
			System.out.println("file path : " + file.getPath());
			System.out.println("file's complete path : " + file.getAbsolutePath());
			System.out.println("file's canonical path : " + file.getCanonicalPath());
			System.out.println("is file a directory : " + file.isDirectory());
			System.out.println("can read file : " + file.canRead());
			System.out.println("can write file : " + file.canWrite());
			
			
			File[] fList = file.listFiles();
			
			for(File f : fList) {
				if(isAccepted(f))
					System.out.println(f);
			}
					
	}
	
	public static boolean isAccepted(File file) {
		if(file.getName().startsWith("A") && file.getName().endsWith(".java"))
			return true;
		return false;
	}

}
