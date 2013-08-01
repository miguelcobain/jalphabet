package org.alphabet.alphabets;

import org.alphabet.Alphabet;

public class Code39 extends Alphabet<Code39>{
	
	final static String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ* -$%./+";

	public Code39() {
		super(ALPHABET,"");
	}
	
	public Code39(String exclusions) {
		super(ALPHABET, exclusions);
	}

}
