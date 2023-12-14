package com.zettamine.java.day06.assignment03;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumberOfUniqueWords {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Student's Article: ");
		String sentence = scn.nextLine();
		uniqueWordsCount(sentence);
	}
	
	private static void uniqueWordsCount(String words) {
		Set<String> set = new TreeSet<String>();
		String[] split = words.split("[^a-zA-Z]+");
		System.out.println("Total number of words in the sentence: "+split.length);
		for(String word:split) set.add(word.toLowerCase());
		System.out.println("Total number of unique words are: "+set.size());
		int serialIds = 1;
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(serialIds++ +". "+iterator.next());
		}
	}
}
