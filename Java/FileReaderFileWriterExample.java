package com.att.javatraining.io.lecture;

import java.io.*;

public class FileReaderFileWriterExample {

	public static void doExampleOne() {
		
		try {
			File inputFile = new File("c:/readme.txt");
			FileReader in = new FileReader(inputFile);
			int aCharacter;
			while ((aCharacter = in.read()) != -1) {
				System.out.print(aCharacter);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
	public static void main(String[] args) {
		doExampleOne();

	}
}
