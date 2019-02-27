package com.att.javatraining.core.labs;

public class Telephone {
	
	private String areaCode;
	private String prefix;
	private String lineNumber;

	public Telephone (String theAreaCode, String thePrefix, String theLineNumber ) {
		areaCode = theAreaCode;
		prefix = thePrefix;
		lineNumber = theLineNumber;
	}
	
	// note this is new version of the method to be explained!
	public boolean equals(Object objectToCompare) {  
		
		if (!(objectToCompare instanceof Telephone))
			return false;
			
		Telephone tel = (Telephone) objectToCompare;
	
		return ((areaCode.equals(tel.areaCode)) && 
			    (prefix.equals(tel.prefix))     && 
			    (lineNumber.equals(tel.lineNumber)));
	}
}
