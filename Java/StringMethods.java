/*
 * Created on May 17, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.att.javatraining.core.lecture;

/**
 * @author mg0319
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class StringMethods {

	public static void main(String[] args) {
		String s = "Apple";
		s.toUpperCase();
		s.toLowerCase();
		s.startsWith("App");
		s.endsWith("X");
		
//		s = new String("Apple");
		s.equalsIgnoreCase("APPLE");		
		s.replace('p','x');		
		s.startsWith("App");
		s.indexOf('e');	

//		String s = "apple";
//		System.out.println(s);
//		System.out.println(s.toUpperCase());	
//		System.out.println(s);
//		
//		String s = "apple";
//		System.out.println(s);
//		s = s.toUpperCase();	
//		System.out.println(s);
//		
//		String s = "super";
//		s = s.toUpperCase().concat(" duper.");
//		System.out.println(s);
		
		


	}
}
