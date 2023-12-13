package com.zettamine.caseStudies.day05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFileClass {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\DJava\\Java\\ToCopyFile.txt");
		File copiedFile = new File("D:\\DJava\\Java\\CopiedFile.txt");
		
		if(file.exists()) {
			Files.copy(file.toPath(), copiedFile.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
			System.out.println("File has been copied");
		}
		else {
			file.createNewFile();
			Files.copy(file.toPath(), copiedFile.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
			System.out.println("File has been created and copied");
		}
	}
}
