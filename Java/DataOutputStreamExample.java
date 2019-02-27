
package com.att.javatraining.io.lecture;

import java.io.*;

public class DataOutputStreamExample {

	public static void main(String[] args) {
		try {
			for ( int x = 0; x < 1000; x++)
			{
			FileOutputStream outputFile = 
				new FileOutputStream("c:/temp75/output" + x + ".dat");
			DataOutputStream dataStream = 
				new DataOutputStream(outputFile);
				for ( int y = 0; y < 300000; y++)
				{
					dataStream.writeByte(0);
					dataStream.writeByte(127);
				}
				dataStream.close();
			}
		} catch (IOException e) { 
			System.out.println(e);
		}

	}
}
