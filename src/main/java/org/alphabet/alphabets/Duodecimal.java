package org.alphabet.alphabets;

import org.alphabet.Alphabet;

public class Duodecimal extends Alphabet<Duodecimal>{
	
	/*
	 * Use 𝒳 and ℰ as the corresponding 10 and 11 values
	 * as proposed by  F. Emerson Andrews' 1935 book
	 * New Numbers: How Acceptance of a Duodecimal Base Would Simplify Mathematics. 
	 */
	final static String ALPHABET = "0123456789𝒳ℰ";

	public Duodecimal() {
		super(ALPHABET,"");
	}
	
	public Duodecimal(String exclusions) {
		super(ALPHABET, exclusions);
	}

}
