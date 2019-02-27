/*
 * Created on Apr 8, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.calendar.lecture;

import java.util.*;
import java.text.SimpleDateFormat;

public class SimpleDateFormatCalendarExample {

	public static void main(String[] args) {

		// SimpleDateFormat Example
		Calendar time = Calendar.getInstance(); 
		 time.set(2005,Calendar.FEBRUARY,1);
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yy");
		System.out.println(dateFormatter.format(time.getTime()));
		        
		SimpleDateFormat timeFormatter = 
			new SimpleDateFormat("E MMMM d, yyyy h:m:s a");
		System.out.println(timeFormatter.format(time.getTime()));
		
	
	}
}
