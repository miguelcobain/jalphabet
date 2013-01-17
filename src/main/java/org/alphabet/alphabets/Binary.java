package org.alphabet.alphabets;

import org.alphabet.Alphabet;

public class Binary extends Alphabet<Binary>{

	final static String ALPHABET = "01";
	
	public Binary() {
		super(ALPHABET,"");
	}
	
	public Binary(String exclusions) {
		super(ALPHABET, exclusions);
	}

}
