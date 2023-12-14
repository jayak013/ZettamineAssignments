package com.zettamine.java.day06.assignment04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountOfEachWord {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Student's Article: ");
		String sentence = scn.nextLine();
		countOfEachWord(sentence);
	}
	
	private static void countOfEachWord(String sentence) {
		String[] split = sentence.split("[,;:.?!\\s]+");
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println("Number of Words: "+split.length);
		for(String s:split) {
			s = s.toLowerCase();
			Integer entry = map.put(s, 1);
			if(entry!=null) map.put(s, entry+1);
		}
		for(String key:map.keySet()) System.out.println(key+" : "+map.get(key));
	}
}
