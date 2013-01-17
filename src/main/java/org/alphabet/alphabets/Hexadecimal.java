package org.alphabet.alphabets;

import org.alphabet.Alphabet;

public class Hexadecimal extends Alphabet<Hexadecimal>{
	
	final static String ALPHABET = "0123456789ABCDEF";

	public Hexadecimal() {
		super(ALPHABET,"");
	}
	
	public Hexadecimal(String exclusions) {
		super(ALPHABET, exclusions);
	}

}
