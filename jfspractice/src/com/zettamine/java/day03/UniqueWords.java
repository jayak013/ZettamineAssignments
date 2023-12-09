package com.zettamine.java.day03;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int uniqueWordsCount = uniqueWordsCount("Hello Everybody, welcome to collection in JAVA. Collection,is like a container and powerful concept in Java!");
		System.out.print("Enter the sentence/para to get unique words: ");
		String sentence = scn.nextLine();
		System.out.println(uniqueWordsCount);
		System.out.println(uniqueWordsCount(sentence));
	}
	
	private static int uniqueWordsCount(String words) {
		Set<String> set = new LinkedHashSet<String>();
		String[] split = words.split("[^a-zA-Z]+");
		for(String word:split) set.add(word.toLowerCase());
		return set.size();
	}
}
