/*
 * Created on Apr 8, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.collections.lecture;

import java.util.*;

import com.att.javatraining.collections.lecture.ATTEmployee;

public class CollectionsExample {

	public static void main(String[] args) {

		List myCoworkers = new ArrayList();

		myCoworkers.add(new ATTEmployee("Mark"));
		myCoworkers.add(new ATTEmployee("Richard"));
		myCoworkers.add(new ATTEmployee("Marge"));
		myCoworkers.add(new ATTEmployee("Glenn"));
		myCoworkers.add(new ATTEmployee("Rick"));
		myCoworkers.add(new ATTEmployee("Marc"));
		myCoworkers.add(new ATTEmployee("James"));
		
		System.out.println("Name Order (Comparable!), then REVERSED");
		Collections.sort(myCoworkers);
		for (int loop=0;loop<2;loop++) {
			Iterator listHelper = myCoworkers.iterator();
			while (listHelper.hasNext()) {
				ATTEmployee anEmployee = (ATTEmployee) listHelper.next();
				System.out.println(anEmployee.getName());
			}
			Collections.reverse(myCoworkers);
			System.out.println("----------------------");
		}
	}
}

