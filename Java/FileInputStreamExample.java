package com.att.javatraining.io.lecture;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			byte[] inputBytes = new byte[999];
			FileInputStream inputFile = new FileInputStream("c:/readme.txt");
			int nBytesRead = inputFile.read(inputBytes);
			inputFile.close();
			System.out.println("Size of File : " + nBytesRead);
			System.out.println("Contents of File: " + new String(inputBytes));
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
