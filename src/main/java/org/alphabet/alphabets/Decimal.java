package org.alphabet.alphabets;

import org.alphabet.Alphabet;

public class Decimal extends Alphabet<Decimal>{
	
	final static String ALPHABET = "0123456789";

	public Decimal() {
		super(ALPHABET,"");
	}
	
	public Decimal(String exclusions) {
		super(ALPHABET, exclusions);
	}

}
