package com.zettamine.java.day06.assignment06;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentReport {
	public static HashMap<String, Integer> getReport(ArrayList<Student> students) {
		HashMap<String, Integer> map = new HashMap();
		for(Student s:students) {
			String loc = s.getLocation();
			Integer entry = map.put(loc, 1);
			if(entry!=null) map.put(loc, entry+1);
		}
		return map;
	}
}
