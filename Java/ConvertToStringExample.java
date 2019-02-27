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
public class ConvertToStringExample {

	public static void main(String[] args) {
		int x = 123;
		String s = String.valueOf(x);
		System.out.println(s);
		
		System.out.println("Hello there!");
		System.err.println("Houston we have a problem!");
		
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("os.name"));
		
		System.out.println("E is:  " + Math.E);
		System.out.println("PI is: " + Math.PI);

		System.out.println(Math.abs( -123 ));
		System.out.println(Math.abs( 123 ));

		System.out.println(Math.max( 10, 20 ));
		
		System.out.println(Math.min( 10, 20 ));

		System.out.println(Math.random());
		
		System.out.println(Math.round(23.45f));
		System.out.println(Math.round(23.54f));
		System.out.println(Math.round(Math.random() * 100));
	}
}
