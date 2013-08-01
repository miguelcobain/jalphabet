package org.alphabet.alphabets;

import org.alphabet.Alphabet;

public class Lowercase extends Alphabet<Lowercase>{
	
	final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	public Lowercase() {
		super(ALPHABET,"");
	}
	
	public Lowercase(String exclusions) {
		super(ALPHABET, exclusions);
	}

}
