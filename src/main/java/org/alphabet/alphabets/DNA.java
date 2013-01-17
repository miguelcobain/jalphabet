package org.alphabet.alphabets;

import org.alphabet.Alphabet;

public class DNA extends Alphabet<DNA>{

	final static String ALPHABET = "ACTG";
	
	public DNA() {
		super(ALPHABET,"");
	}
	
	public DNA(String exclusions) {
		super(ALPHABET, exclusions);
	}

}
