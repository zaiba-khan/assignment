package com.zettamine.caseStudies.day03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's article : ");
		String sentence = sc.nextLine().toLowerCase();
		
		String[] words = sentence.split("[,.!\\s]+");
		System.out.println("Number of words : " + words.length);
		
		Set<String> unique = new HashSet<>();
		for(String word : words )
			unique.add(word);
		
		System.out.println("Number of unique words are : " + unique.size());
		
		
	}
	
	
}
