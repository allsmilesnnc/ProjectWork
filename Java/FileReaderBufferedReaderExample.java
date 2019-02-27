package com.att.javatraining.io.lecture;

import java.io.*;

public class FileReaderBufferedReaderExample {

	public static void doExampleOne() {
		
		try {
			File inputFile = new File("c:/readme.txt");
			FileReader in = new FileReader(inputFile);
			BufferedReader reader =new BufferedReader(in);
			String inputLine = new String();
			do {
				inputLine = reader.readLine();
				System.out.println(inputLine); 
			} while (inputLine != null);
			reader.close();		
			} catch (IOException e) {
			e.printStackTrace();
		}


	}
	public static void main(String[] args) {
		doExampleOne();

	}
}
