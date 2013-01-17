package org.alphabet.alphabets;

import org.alphabet.Alphabet;

public class Uppercase extends Alphabet<Uppercase>{
	
	final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public Uppercase() {
		super(ALPHABET,"");
	}
	
	public Uppercase(String exclusions) {
		super(ALPHABET, exclusions);
	}

}
