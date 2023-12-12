package com.zettamine.java.day05.assignment03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class CopyFile {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:/CJava/java/renamedjava.txt");//source
		File newCopy = new File("C:/CJava/java/copiedjava.txt");//Destination
		if(f.exists()) {
			Files.copy(f.toPath(), newCopy.toPath(), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File is successfully copied..");
		}else {
			System.out.println("Source File not available");
		}
			
	}
	
}
