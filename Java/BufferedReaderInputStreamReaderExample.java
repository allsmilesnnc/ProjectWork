package com.att.javatraining.io.lecture;

import java.io.*;
import java.net.URL;

public class BufferedReaderInputStreamReaderExample {

	public static void main(String[] args) {
		try {
			URL sbc;
			sbc = new URL("http://www.att.com/");
			BufferedReader in = new BufferedReader( 
				 new InputStreamReader(sbc.openStream() ));
			String inputLine;
			StringBuffer htmlBuffer = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				htmlBuffer.append(inputLine);
				htmlBuffer.append("\n");
			}
			in.close();
			System.out.println("HTML read from sbc.com");
			System.out.println(htmlBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
