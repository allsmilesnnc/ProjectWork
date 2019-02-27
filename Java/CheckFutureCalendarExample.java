/*
 * Created on Apr 8, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.calendar.lecture;

import java.util.*;

public class CheckFutureCalendarExample {

	public static void main(String[] args) {

		// Check Future
		Calendar now = Calendar.getInstance();
		Calendar future = Calendar.getInstance();
		future.set(2020,Calendar.JANUARY,1,0,0,0);

		if (future.before(now)) {
		System.out.println("We must have traveled through time!");
		}
	
	}
}
