package com.zettamine.caseStudies.day05;

import java.io.File;
import java.io.IOException;

public class FileRenamingProgram {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\DJava\\Java\\RenameFile.txt");
		File renamedFile = new File("D:\\DJava\\Java\\FileHasBeenRenamed.txt");
		
		if(file.exists()) {
			file.renameTo(renamedFile);
			System.out.println("File has been renamed to : " + renamedFile.getName());
		}
		else {
			file.createNewFile();
			file.renameTo(renamedFile);
			System.out.println("File has been created and renamed to : " + renamedFile.getName());
		}
	}

	
}
