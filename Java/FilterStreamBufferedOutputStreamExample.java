package com.att.javatraining.io.lecture;

import java.io.*;

public class FilterStreamBufferedOutputStreamExample {

	public static void main(String[] args) {
		
		byte[] b = new byte[1000000];
		
		for ( int x = 0; x < b.length - 1; x++ )
		{
			b[x] = 0;
			x++;
			b[x] = 127;
		}
		System.out.println("Ready to write");
		try {
			for ( int x = 0; x < 100; x++)
			{
			FileOutputStream outputFile = 
				new FileOutputStream("c:/temp75/output2" + x + ".dat");
			BufferedOutputStream bufferedStream = new BufferedOutputStream(outputFile, 1000000);
			DataOutputStream dataStream = new DataOutputStream(bufferedStream);
				for ( int y = 0; y < 300; y++)
				{
					dataStream.write(b);
				}
				dataStream.close();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
