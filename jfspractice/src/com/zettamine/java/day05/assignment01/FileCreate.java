package com.zettamine.java.day05.assignment01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {
	
	private static final String FILE_PATH = "C:/CJava/java/java.txt";
	private static final String DIRECTORY_PATH = "C:/CJava/java";

	public static void main(String[] args) throws IOException {
		File f = new File(DIRECTORY_PATH);
		if(f.exists())
			System.out.println("Directories already created...");
		else {
			f.mkdirs();
			System.out.println("Created directories");
		}
//		f.mkdir();//to make one successive directory
		f = new File(FILE_PATH);
		if(f.exists()) System.out.println("File Already Exists...");
		else {
			f.createNewFile();
			System.out.println("Created File");
		}
		
		FileWriter fW = new FileWriter(f);
		fW.write("Successfully created the file with name java which is going to be renamed");
		fW.close();
	}
	
}
