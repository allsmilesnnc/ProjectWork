/*
 * Created on Apr 8, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.calendar.lecture;

import java.util.*;
import java.text.DateFormat;

public class DateFormatCalendarExample {

	public static void main(String[] args) {

		// DateFormat Example
		Calendar time = Calendar.getInstance(); 
		time.set(2005,Calendar.FEBRUARY,1);

		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(time.getTime()));
		        
		df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(time.getTime())); 

	}
}
