package com.att.javatraining.io.lecture;

import java.io.*;

public class BufferedReaderStdinExample {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input;
			while ((input = reader.readLine()) != null) {
				System.out.println(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}



	}
}
