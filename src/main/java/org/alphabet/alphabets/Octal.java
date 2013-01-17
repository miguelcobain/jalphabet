package org.alphabet.alphabets;

import org.alphabet.Alphabet;

public class Octal extends Alphabet<Octal>{
	
	final static String ALPHABET = "01234567";

	public Octal() {
		super(ALPHABET,"");
	}

	
	public Octal(String exclusions) {
		super(ALPHABET, exclusions);
	}

}
