package com.zettamine.java.day05.assignment02;

import java.io.File;
import java.io.IOException;

public class RenameFile {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:/CJava/java/renamedjava.txt");
		File rename = new File("C:/CJava/java/java.txt");
		if(f.exists()) {
			f.renameTo(rename);
			System.out.println("successfully renamed");
		}else System.out.println("destination file not available");
	}
	
}
