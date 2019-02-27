
package com.att.javatraining.collections.lecture;

import java.util.*;

import com.att.javatraining.collections.lecture.ATTEmployee;

public class IteratorHashMapExample {

	public static void main(String[] args) {
	
		HashMap attidMap = new HashMap();
		attidMap.put("mg0319", new ATTEmployee("Mark", "235-1663"));
		attidMap.put("fr2128", new ATTEmployee("Frank", "235-4114"));
		
		Set set = attidMap.keySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			String key = (String) it.next();
			ATTEmployee value = (ATTEmployee) attidMap.get(key);
			System.out.println("Key = " + key);
			System.out.println("Value = " + value);
		}
		
		
	}
}
