/*
 * Created on Apr 8, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.calendar.lecture;

import java.util.*;

public class CreateCalendarExample {

	public static void main(String[] args) {

		// Create a calendar with system time!
		Calendar systemTime = Calendar.getInstance();

		// Create a calendar for midnight jan 1, 2020
		Calendar theFuture = Calendar.getInstance();
		theFuture.set(2020,0,1,0,0,0);

		// Change the year to 2020
		Calendar aCalendar = Calendar.getInstance();
		aCalendar.set(Calendar.YEAR,2020);
		
	}
}
