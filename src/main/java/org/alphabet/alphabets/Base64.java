package org.alphabet.alphabets;

import org.alphabet.Alphabet;

public class Base64 extends Alphabet<Base64>{
	
	final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	public Base64() {
		super(ALPHABET,"");
	}
	
	public Base64(String exclusions) {
		super(ALPHABET, exclusions);
	}
}
